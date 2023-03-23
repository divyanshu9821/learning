//swap element with the next element if the next element is smaller than previous element

//Time complexity = O(N^2)

#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{
    int noOfElements;
    cin>>noOfElements;
    int arr[noOfElements];
    for(int i = 0;i<noOfElements;i++)
        cin>>arr[i];
    int counter = 1;

    while(counter<noOfElements){
        for(int j = 0;j<noOfElements - counter;j++)
        {
            if(arr[j]>arr[j+1]){
                int temp;
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        counter ++;
    }

    for(int i = 0;i<noOfElements;i++)
        cout<<arr[i]<<endl;

    return 0;
}