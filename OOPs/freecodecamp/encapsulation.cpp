#include <bits/stdc++.h>
using namespace std;

class Employee
{
private://it is default in cpp    
    string Name;
    string Company;
    int Age;

public:
    void setName(string name)//setter method
    {
        Name = name;
    }
    string getName()//getter method
    {
        return Name;
    }

    void setCompany(string company)//setter method
    {
        Company = company;
    }
    string getCompany()//getter method
    {
        return Company;
    }

    void setAge(int age)//setter method
    {
        Age = age;
    }
    int getAge()//getter method
    {
        return Age;
    }


    void display(){
        cout<<Name<<" "<<Company<<" "<<Age;
    }
};
// User defined function

int main()
{
    Employee emp1;
    emp1.setName("Divyanshu");
    emp1.setCompany("Apple");
    emp1.setAge(30);
    cout << emp1.getAge() << endl;

    return 0;
}