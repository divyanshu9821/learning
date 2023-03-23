#include <iostream>
using namespace std;

class alpha
{
private:
    int a1;

public:
    alpha(int n)
    {
        a1 = n;
    }
    friend class beta;
};

class beta
{
public:
    void func()
    {
        alpha a(4);
        cout<<a.a1<<endl; // in absence of friend class this gives error because we cannot access private members of class from other class
    }
};

int main()
{

    // Start coding
    beta b;
    b.func();

    return 0;
}