#include <iostream>
using namespace std;

class rectangle
{
private:
    int length, breadth;

public:
    rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }

    int area()
    {
        return length * breadth;
    }
};

class cubeoid : public rectangle
{
private:
    int height;

public:
    cubeoid(int len, int bre, int hei) : rectangle(len, bre)
    {
        height = hei;
    }

    int volume()
    {
        return rectangle::area() * height;
    }
};

int main()
{
    // Start coding
    cubeoid c(1, 2, 3);
    cout << c.volume() << endl;
    cout << c.area();
    return 0;
}