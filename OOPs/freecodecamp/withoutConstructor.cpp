#include <iostream>
using namespace std;

class Employee
{
    //private:
public: //to access an object outside the class
    string Name;
    string Company;
    int Age;
    void printInfo()
    { //this the class method
        cout << "Name - " << Name << endl;
        cout << "Company - " << Company << endl;
        cout << "Age - " << Age << endl;
    }
};

int main()
{
    Employee emp1, emp2;
    
    emp1.Name = "Divyanshu Singhal";
    emp1.Company = "DRDO";
    emp1.Age = 22;
    emp1.printInfo();

    emp2.Name = "Rachit Singhal";
    emp2.Company = "INA";
    emp2.Age = 19;
    emp2.printInfo();
}

    