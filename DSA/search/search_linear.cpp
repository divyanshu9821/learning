//iterate through all the elements until the element matches the given key element.

//time complexity = O(N)

#include <bits/stdc++.h>
using namespace std;

int funcToDetect(int arr[], int noOfElements, int searchForElement){
    for(int i =0;i<noOfElements;i++)
    {
        if(arr[i]==searchForElement)
            return i;
    }
    return -1;
}
int main(){
    int noOfElements;
    cin >>noOfElements;
    int arr[noOfElements];
    for(int i =0;i<noOfElements;i++)
    {
        cin>>arr[i];
    }
    int searchForElement;
    cin>>searchForElement;
    cout<<"Available at index : "<<funcToDetect(arr,noOfElements, searchForElement)<<endl;
    return 0;
}