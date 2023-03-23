#include<iostream>
using namespace std;

void wave_sort(int[], int);
void print(int[], int);

int main()
{

    int arr[] = {3,1,3,2,1};
    int n = sizeof(arr)/sizeof(arr[0]);
    wave_sort(arr,n);
    print(arr,n);

    return 0;
}

void wave_sort(int arr[], int n){
    int i = 1;
    while(i<n){
        if(arr[i]>arr[i-1])
            swap(arr[i],arr[i-1]);

        if(arr[i]>arr[i+1] && i<=n-2)
            swap(arr[i],arr[i+1]);

        i+=2;        
    }
    
}

void print(int arr[], int n){
    for(int i = 0;i<n;i++)
        cout<<arr[i]<<" ";
    cout<<endl;    
}