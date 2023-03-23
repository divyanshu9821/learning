//find the minimum element in the unsorted array and swap it with the element at beginning.

//Time complexity = O(N^2)

#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    
    int noOfElements;
    cin>>noOfElements;
    int arr[noOfElements];
    for(int i =0 ;i<noOfElements;i++)
        cin>>arr[i];

    for(int i = 0;i<noOfElements;i++){
        for(int j = i+1;j<noOfElements;j++){
            if(arr[j]<arr[i]){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    } 
    for(int i =0 ;i<noOfElements;i++)
        cout<<arr[i]<<" ";   
    cout<<endl;
    return 0;
}