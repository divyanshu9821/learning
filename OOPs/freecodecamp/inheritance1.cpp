#include <bits/stdc++.h>
using namespace std;

class Employee
{
    //default access modifier which is 'private' in c++
    string Name;
    string Company;
    int Age;

public: //public access modifier.
    void setName(string name)
    {
        Name = name;
    }
    string getName()
    {
        return Name;
    }

    void setCompany(string company)
    {
        Company = company;
    }
    string getCompany()
    {
        return Company;
    }

    void setAge(int age)
    {
        Age = age;
    }
    int getAge()
    {
        return Age;
    }

    Employee(string name, string company, int age)
    {
        Name = name;
        Company = company;
        Age = age;
    }
    void display()
    {
        cout << Name << " " << Company << " " << Age << endl;
    }
};

class Developer : Employee
{
    string FavLang;

public:
    Developer(string name, string company, int age, string favLang)
        : Employee(name, company, age)
    {
        FavLang = favLang;
    }
    void devDisplay()
    {
        cout << getName() << " loves to code in "<< FavLang<<endl;
    }
};

int main()
{
    Employee emp1 = Employee("Divyanshu", "Apple", 30);
    emp1.display();

    Developer emp2 = Developer("Anshu", "Airtel", 23, "C++");
    emp2.devDisplay();
    return 0;
}