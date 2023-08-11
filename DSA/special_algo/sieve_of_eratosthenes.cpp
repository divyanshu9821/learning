// this alogrithm is use to find the prime factorization
#include<iostream>
using namespace std;

void factors(int num){
    int arr[num+1];
    for(int i = 0;i<=num;i++){
        arr[i] = i;
    }

    for(int i = 2;i<=num;i++){
        if(arr[i]==i){
            for(int j = i*i;j<=num;j+=i){
                if(arr[j]==j){
                    arr[j]=i;
                }
            }
        }
    }

    while(num>1){
        cout<<arr[num]<<" ";
        num/=arr[num];
    }
    cout<<endl;
    return;
}

int main()
{

    int num = 500;
    factors(num);

    return 0;
}