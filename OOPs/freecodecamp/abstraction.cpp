#include <bits/stdc++.h>
using namespace std;

class abstractEmployee
{
    virtual void promotion() = 0; // pure virtual function its implementation details is hidden.
};

class Employee : abstractEmployee // 'Employee' class is inherited from 'abstractEmployee' Class
{
private:
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

    void promotion()
    {
        if (Age > 30)
            cout << Name << " get promotion" << endl;
        else
            cout << Name << " not get promotion" << endl;
    }
};

int main()
{
    Employee emp1;
    emp1.setName("Divyanshu");
    emp1.setCompany("Apple");
    emp1.setAge(30);
    cout << emp1.getName() << " " << emp1.getCompany() << " " << emp1.getAge() << " " << endl;
    emp1.promotion();
    return 0;
}