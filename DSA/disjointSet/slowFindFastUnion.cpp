#include<iostream>
using std::cin;
using std::cout;

// storing the parent of the element and root element contain itself as a parent
// slowfind implementation(worst case complexity O(n))
// called slowFind because in the worst case there is a formation of skew tree that takes O(n) to reach to the root 

// storing all the elements in seprate set at the initialization time
void MAKESET(int S[], int size){
    for (int i = 0; i < size; i++)
        S[i] = i;
}

// recursively find the parent of the element until root is find, if the index and element stored at the index is not equal
int FIND(int S[],int size,int X){
    if(X<=0 || X>size )return -1; // exception, X should not be greated than size or smaller than 0
    
    if(S[X]==X) return X;
    else FIND(S,size,S[X]);
}

void UNION(int S[], int size, int root1, int root2){
// if one root is descendent of another root than they are already in a same set
    if(FIND(S,size,root1)==FIND(S,size,root2)) return;
// if any of the element dont lie the range of set then union is not possible
    if(root1>size||root2>size||root1<0||root2<0) return;

// make one of root is the child of other root
    S[root1] = root2;
}

int main(){
    int SET[] = {0,1,2,1,2,1};
    UNION(SET,6,1,2);
    cout<<FIND(SET,6,3);
    cout<<FIND(SET,6,4);
    for (int i = 0; i < 6; i++)
    {
        cout<<SET[i]<<" ";
    }
    
    
    return 0;
}