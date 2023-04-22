#include<fstream>
#include<iostream>
using namespace std;

int main(){
    int a;
    fstream file;
    file.open("input.txt",ios::in);
    if(file.is_open()){
        file>>a;
    }

    cout<<a;
}