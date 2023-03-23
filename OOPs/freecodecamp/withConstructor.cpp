#include <iostream>

class Employee
{
    //private:
public: //to access an object outside the class
    std::string Name;
    std::string Company;
    int Age;
    void printInfo()
    { //this the class method
        std::cout << "Name - " << Name << std::endl;
        std::cout << "Company - " << Company << std::endl;
        std::cout << "Age - " << Age << std::endl;
    }
    //constructor
    Employee(std::string name, std::string company, int age){
        Name = name;
        Company = company;
        Age = age;
    }
};

int main()
{
    Employee emp1 = Employee("Divyanshu Singhal","DRDO",22);
    emp1.printInfo();
    Employee emp2 = Employee("Rachit Singhal","INA",19);
    emp2.printInfo();
}