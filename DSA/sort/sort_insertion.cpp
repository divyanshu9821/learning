//insert an element from unsorted array to its correct position in sorted array

//Time Complexity = O(N^2)

#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int n;
    cin>>n;
    //input elements in array
    int arr[n];
    for(int i = 0;i<n;i++){
        cin>>arr[i];
    } 
    //sort array
    for(int i = 1;i<n;i++){
        int current = arr[i];
        int j = i -1;
        while(arr[j]>current && j>=0){
            arr[j+1] =arr[j];
            j--;
        }
        arr[j+1] = current;
    }
    //output sorted array
    for (int i =0;i<n;i++)
        cout<<arr[i]<<endl;
    return 0;
}