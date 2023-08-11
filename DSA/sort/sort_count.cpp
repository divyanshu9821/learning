//count sort
#include <iostream>
using namespace std;

void count_sort(int[], int);

void print(int[], int);

int main(void)
{
    int arr[] = {3,1,3,2,1};
    int n = sizeof(arr)/sizeof(arr[0]);
    count_sort(arr, n);
    print(arr,n);
    return 0;
}

void count_sort(int arr[], int n){
    
    int max_ele = arr[0]; // max element in arr is for the length of count array
    
    for (int i = 0; i < n; i++)
        max_ele = max(max_ele, arr[i]);
    
    int freq[max_ele+1] = {0}; // must be initialized by 0

    for (int i = 0; i < n; i++)
    {
        freq[arr[i]]++; // arr element use as a index for freq arr
    }


    // making it cummulative array it store the correct position of element(its index is the arr element and its element is the correct position)
    for(int i = 1;i<=max_ele;i++){
        freq[i] += freq[i-1];
    }


    int temp[n];
    for(int i = n-1;i>=0;i--){
        int element = arr[i]; // element is to put in temp array
        int pos = freq[element]; // pos-1 is the position where to put the element
        temp[--pos] = element;
    }

    // simple overwrite
    for(int i = 0;i<n;i++){
        arr[i] = temp[i];
    }

}

void print(int arr[], int n){
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    
}

