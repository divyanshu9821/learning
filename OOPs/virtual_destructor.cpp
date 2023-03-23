#include<iostream>
using namespace std;

class base{
    public:
    virtual ~base(){
        cout<<"base destroyed"<<endl;
    }
};

class derive:public base{
    public:
    ~derive(){
        cout<<"derive destroyed"<<endl;
    }
};

int main()
{

    // Start coding
    base *ptr = new derive;
    delete ptr;

    return 0;
}