// opeartors work with predefined datatypes but they cannot work with userdefined datatypes
// when we make operators work for user defined datatypes like objects and structures this is called opeartor overloading

#include <iostream>
using namespace std;

class overloading
{
private:
    int num;

public:
    overloading(int n = 0)
    { // overloaded constructor
        num = n;
    }

    overloading operator +(overloading obj) // addition operator overloading
    {
        overloading temp;
        temp.num = num + obj.num;
        return temp;
    }

    overloading operator ++()
    { // pre increment operator overloading
        ++num;
    }

    overloading operator ++(int)
    { // post increment operator overloading
        num++;
    }

    friend bool operator <(overloading a, overloading b){
        return a.num < b.num;
    }

    void print()
    {
        cout << num << endl;
    }
};

int main()
{

    overloading num1(3), num2(5), temp;
    temp = num1 + num2;
    ++temp;
    temp++;
    temp.print();
    if(num1<num2){
        cout<<"true"<<endl;
    }
    return 0;
}