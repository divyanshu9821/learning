//maximum subarray sum
/*
make a variable that updated each time and store the cummlative sum if the cummlative sum is negative 
than it replace that negative value with zero
we make another variable that check the maximum value in variable that is storing cummulative sum.
*/
#include<bits/stdc++.h>
using namespace std;

// User defined function

int main()
{	
    int noOfElements;
    cin>>noOfElements;
    //5
    int arr[noOfElements];
    for(int i = 0;i<noOfElements;i++)
        cin>>arr[i];
    //-1 4 -6 7 -4
    int currSum = 0;
    int maxSum = INT_MIN;
    for(int i = 0;i<noOfElements;i++){
        currSum+=arr[i];
        if(currSum<0){
            currSum = 0;
        }
        maxSum = max(maxSum, currSum);
    }
    cout<<maxSum<<endl;
    return 0;
}