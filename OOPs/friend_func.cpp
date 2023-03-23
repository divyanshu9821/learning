#include <iostream>
using namespace std;

class people
{
private:
    int age;
    public:
    people(int n){
        age = n;
    }

    friend void func();
};

class after{
    private:
    int time;
    public:
    after(int n){
        time = n;
    }
    friend void func();
};

void func(){
    people a(5);
    after b(10);
    int sum = a.age+b.time;
    cout<<"after "<<b.time<<" years, a "<<a.age<<" year child become "<<sum<<" years old"<<endl;

}

int main()
{

    // Start coding
    func();

    return 0;
}