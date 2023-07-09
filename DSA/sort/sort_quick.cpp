#include <iostream>
using namespace std;

// partition this will order the element, element smaller to pivot are on left and greater on the right
int partition(int arr[], int st, int en)
{
    int pivot_ele = arr[en]; // taking last element as a pivot element
    
    int i = st-1; // initializing i with the pointer 1 less than starting point
    for(int j = st;j<=en;j++){ // loop from first element index to last element index
        if(arr[j]<pivot_ele){
            i++;
            swap(arr[i],arr[j]);
        }
    }
    swap(arr[i+1],arr[en]);
    return i+1;
    
}

void quick_sort(int arr[], int st, int en)
{
    if (st >= en)
        return;

    // choose pivot
    int pivot = partition(arr, st, en);

    // break the arr into two parts exclude pivot element
    quick_sort(arr, st, pivot - 1);
    quick_sort(arr, pivot + 1, en);
    return;
}

int main()
{
    int n;
    cout<<"Enter number of elements: "; cin>>n;
    int arr[n];
    cout<<"Enter "<<n<<" elements:= "<<endl;
    for (int i = 0; i < n; i++)
    {
        cin>>arr[i];
    }

    quick_sort(arr, 0, n - 1);
    for (int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
    return 0;
}