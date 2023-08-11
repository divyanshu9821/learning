#include<iostream>
#include<fstream>
using namespace std;

int main(){
    
    fstream file;
    file.open("output.txt",ios::out);
    if(file.is_open()){
        file<<"working";
        file.close();
    }

    else cout<<"no worked";
    
    
    return 0;
}