#include <iostream>
using namespace std;

// user defined function
void dnf_sort(int arr[], int n)
{
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid < high)
    {
        if (arr[mid] == 2)
        {
            swap(arr[mid], arr[high]);
            high--;
        }
        else if (arr[mid] == 0)
        {
            swap(arr[low], arr[mid]);
            low++;
            mid++;
        }
        else
            mid++;
    }
    return;
}

int main()
{

    int arr[] = {1, 1, 2, 0, 0, 1, 2, 2, 1, 0};
    int n = sizeof(arr) / sizeof(arr[0]);
    dnf_sort(arr, n);
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}