#include<iostream>
using namespace std;

class base{
    public:
    virtual void show(){
        cout<<"base"<<endl;
    }

    virtual void pure()=0; // this is pure virtual function
};

class derive:public base{
    public:
    void show(){
        cout<<"derive"<<endl;
    }

    void pure(){
        // this is mendatory to declare this function otherwise it will give error
    }
};

int main()
{

    // Start coding
    base *ptr;
    ptr = new derive();
    ptr->show();
    // if function is not virtual than it prints "base"
    // but it is virtual so it prints "derive"
    delete ptr;
    return 0;
}