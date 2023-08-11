//pick the element form the middle of the array and check with the key element if the 
//middle element is smaller than key element than we perform same operation in the array
//after the middle element otherwise perform same operation in the array before the 
//middle element until we find the key element in the array.

//time complexity = O(log N)

#include<bits/stdc++.h>
using namespace std;

int binarySearch(int arr[], int noOfElements, int key){
    int startPoint = 0;
    int endPoint = noOfElements;
    while(startPoint<=endPoint){
        int mid = (startPoint+endPoint)/2;
        if(arr[mid] == key)
            return mid;
        else if(arr[mid]>key)
            endPoint = mid-1;
        else
            startPoint = mid+1;            
    }
    return -1;
}

int main()
{
    int noOfElements;
    cin>>noOfElements;
    int arr[noOfElements];
    int key; cin>>key;    
    for(int i =0;i<noOfElements;i++)
        cin>>arr[i];
    cout<<binarySearch(arr, noOfElements, key)<<endl;
    return 0;
}