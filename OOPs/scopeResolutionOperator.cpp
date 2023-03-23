#include <iostream>
#include <string>
using namespace std;

class Phone
{
private:
    int ram, battery;
    string name, processor;

public:
    Phone(string nm, int rm, string prcsr, int btry)
    {
        name = nm;
        ram = rm;
        processor = prcsr;
        battery = btry;
    }

    Phone(Phone &copy)
    {
        name = copy.name;
        ram = copy.ram;
        processor = copy.processor;
        battery = copy.battery;
    }

    void print_detail();
};

// declare the funtion inside and,
// define outside the class
void Phone::print_detail() // :: scope resolution operator
{
    cout << "Phone:-" << endl;
    cout << "Name : " << name << endl; // accessing private members because this function is declared inside the class
    cout << "Processor : " << processor << endl;
    cout << "RAM : " << ram << endl;
    cout << "Battery : " << battery << endl
         << endl;
}

int main()
{
    Phone smsng("Samsung galaxy s22", 16, "Exynos", 3700);
    Phone mi("Mi A2", 4, "Snapdragon", 3100);
    Phone ggl("Google Pixel", 8, "Tensor", 3700);
    Phone ggl2(ggl);

    smsng.print_detail();
    mi.print_detail();
    ggl.print_detail();
    ggl2.print_detail();
}