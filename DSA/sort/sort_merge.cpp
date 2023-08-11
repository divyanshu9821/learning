#include <iostream>
using namespace std;

void merge(int arr[], int st, int mid, int en)
{
    int size = en - st + 1; // size of temp arr
    int temp[size];// temp arr declare
    int index = 0; // index to iterate over temp arr

    int i = st; // to point first portion
    int j = mid + 1; // to point second portion
    while (i <= mid && j <= en) // till traversing on portions is not finished, here traversing on one porition may be finished because there may be difference in two porition
    {
        if (arr[i] < arr[j]) // checking which element is small
            temp[index++] = arr[i++]; // put the small element in the temp arr and increment the pointer on the portition where small element found

        else
            temp[index++] = arr[j++]; // incase of small element is in the second portion 
    }

    while (i <= mid) // if elements left in the first portion that are not inserted in temp array
        temp[index++] = arr[i++];

    while (j <= en)
        temp[index++] = arr[j++]; // incase element left from this porition

    index = 0;
    while(index<size)
        arr[st++] = temp[index++];  // putting all the elements from temp arr to original arr
}

void merge_sort(int arr[], int st, int en)
{
    if (st >= en)
    {
        return;
    }

    int mid = st + (en - st) / 2; // fiding mid point in the arr
    merge_sort(arr, st, mid); // breaking the array from mid, first porition
    merge_sort(arr, mid + 1, en);// second portion

    merge(arr, st, mid, en); // merging array portions , by comparing and sorting elements
}

int main()
{

    int arr[] = {5, 2, 1, 7, 3, 4, 4, 4};
    int size = sizeof(arr) / sizeof(arr[0]);
    merge_sort(arr, 0, size - 1);
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}