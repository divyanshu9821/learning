#include <iostream>
#include <fstream>
using namespace std;
int main()
{
    ifstream input;
    ofstream output;
    input.open("input.txt");
    output.open("output.txt");
    if (input.is_open() && output.is_open())
    {
        int t;
        input >> t;
        int num;
        while (t--)
        {
            input >> num;
            for (int i = 1; i <= 10; i++)
            {
                output << num * i << " ";
            }
            output << endl;
        }

        output.close();
        input.close();
    }

    else
        cout << "Error" << endl;
 
    return 0;
}