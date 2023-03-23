// this contain the fibbonacci series implemented using dynamic programming technique
#include<iostream>
using namespace std;

int dic[] = {};

int fibbo(int n){//
    if(dic[n]>-1)
        return dic[n];

    if(n<=2)
        return 1;

    int f = fibbo(n-1)+fibbo(n-2);
    dic[n] = f;
    return f;    
}

int main(){

    int n;
    cin>>n;
    dic[n+1];
    for(int i = 0;i<=n;i++){
        dic[i]=-1;
    }

    cout<<fibbo(n)<<endl;

    return 0;
}