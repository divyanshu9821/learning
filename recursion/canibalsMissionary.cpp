#include <iostream>
using namespace std;

void print(int lm, int lc, int rm, int rc)
{
    cout << "left M" << lm << "\t";
    cout << "Right M" << lm << endl;
    cout << "left C" << lm << "\t";
    cout << "Right C M" << lm << endl;
    cout << endl;
}

bool condition(int lm, int lc, int rm, int rc)
{
    if (lm < 0 || lc < 0 || rm < 0 || rc < 0)
        return false;
    if (lm > 3 || lc > 3 || rm > 3 || rc > 3)
        return false;
    if (lm >= lc && rm >= rc)
        return true;
    if ((lm == 0 && rm == 3) || (lm == 3 && rm == 0))
        return true;
    return false;
}

bool move(int lm, int lc, int rm, int rc)
{
    if (rm == 3 && lm == 0 && rc == 3 && lc == 0)
    {
        print(lm, lc, rm, rc);
    }
    return true;

    if (!condition(lm, lc, rm, rc))
        return false;

    print(lm, lc, rm, rc);

    if (move(lm - 2, lc, rm + 2, rc) || move(lm - 1, lc - 1, rm + 1, rc + 1) || move(lm, lc - 2, rm, rc + 2))
    {
        if (move(lm + 1, lc, rm - 1, rc) || move(lm, lc + 1, rm, rc - 1))
        {
            return true;
        }
    }
    return false;
}

int main()
{
    move(3, 3, 0, 0);
}