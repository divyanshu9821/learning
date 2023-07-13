#include<iostream>
using std::cin;
using std::cout;

// with path compression
// storing parent of the element and (-ve)no of elements as a root ,for ex = -2(if two elements) 
// fast find as height of the tree wont exceed logn (worst case O(logn))

void MAKESET(int *arr, int size){
    for(int i = 0;i<size;i++){
        arr[i] = -1;
    }
};

int FIND(int *arr, int size, int X){
    if(X>size||X<0) return -1; // exception, element not in range
    
    if(arr[X]<=-1) return X;
    else return arr[X] = FIND(arr,size,arr[X]); //path compression
};


void UNION(int* arr,int size, int root1, int root2){
    if(FIND(arr,size,root1)==FIND(arr,size,root2)) return;

    if(arr[root1]<arr[root2]) // tree 1 is bigger
    {
        arr[root1]+=arr[root2];
        arr[root2] = root1;
    }
    else
    {
        arr[root2]+=arr[root1];
        arr[root1]=root2;
    } 
};


int main(){
    int arr[8] = {-1,-7,1,1,3,3,5,5};
    FIND(arr,8,6);
    for(int i = 0;i<8;i++){
        cout<<arr[i]<<" ";
    }
    
    return 0;
}