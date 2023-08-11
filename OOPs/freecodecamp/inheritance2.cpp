#include <bits/stdc++.h>
using namespace std;

class AbstractEmployee //abstract class
{
    virtual void promotion() = 0; //pure virtual function or method
};

class Employee : AbstractEmployee //'Employee' class is inherited from 'AbstractEmployee' class
{
    //default access modifier is private in C++
    string Company; //class members or attribute or properties
    int Age;

protected: //access modifier
    string Name;

public:
    void setName(string name) //setter method
    {
        Name = name;
    }
    string getName() //getter method
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

    Employee(string name, string company, int age) //constructor
    {
        Name = name;
        Company = company;
        Age = age;
    }

    void employeeDisplay() //class method
    {
        cout << Name << " " << Company << " " << Age << endl;
    }

    void promotion()
    {
        if (Age > 40)
            cout << Name << " get promotion." << endl;
        else
            cout << Name << " not get promotion." << endl;
    }
};

class Developer : public Employee //'Developer' class is inherited from 'Employee' class.
{
public:
    string FavLang;

    Developer(string name, string company, int age, string favLang)
        : Employee(name, company, age)
    {
        FavLang = favLang;
    }
    void developerDisplay()
    {
        cout << "Employee of this " << getCompany() << " use " << FavLang << " for game development." << endl;
    }
};

class Teacher : public Employee
{
public:
    string Subject;

    Teacher(string name, string company, int age, string subject)
        : Employee(name, company, age)
    {
        Subject = subject;
    }

    void teacherDisplay()
    {
        cout << Name << " is preparing " << Subject << " lesson." << endl;
    }
};

int main()
{
    Developer d = Developer("Divyanshu", "Airtel", 23, "C++");
    Teacher t = Teacher("Mansi", "School of Military Sciences", 31, "Maths");
    t.teacherDisplay();
    t.promotion();
    return 0;
}