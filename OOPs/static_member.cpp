#include<iostream>
using namespace std;

class sum{
    private:
    int a,b;
    public:
    sum(int n, int m){
        a=n;
        b=m;

        count++;
    }
    static int count;
    void print_sum(){
        cout<<a+b<<endl;
    }
};

int sum::count = 0;

int main()
{

    sum a(1,2);
    sum b(2,3);
    sum c(3,4);
    a.print_sum();
    b.print_sum();
    c.print_sum();
    cout<<a.count<<endl;

    // Start coding

    return 0;
}