// priority_queue is the ADT
// implemented using max_heap
// get max - get the maximum element from the heap which is root in max heap
// delete max - return the maximum element and delete it from heap
// insert - insert element into heap

// property of heap - element is bigger than its children(max heap) or element is smaller than its children(min heap)

#include <iostream>
using namespace std;

// sturucture of heap
struct Max_heap
{
    int *array;    // using array to store element
    int count;     // #elements in array
    int capacity;  // size of array
};

// create heap
Max_heap *create(int capacity)
{
    Max_heap *h = new Max_heap();    // create a new heap
    h->capacity = capacity;          // set heap capacity
    h->count = 0;                    // initalize count
    h->array = new int[h->capacity]; // allocating memory to array = capacity
    return h;
}

// get parent of that node it will be at (i-1)/2
int parent(Max_heap *h, int i)
{
    if (i <= 0 || i >= h->count)
        return -1;
    else
        return (i - 1) / 2;
}

// get children they will be at i*2+1, i*2+2 in array
int left_child(Max_heap *h, int i)
{
    int child = i * 2 + 1;
    if (child >= h->count)
        return -1;
    return child;
}

int right_Child(Max_heap *h, int i)
{
    int child = i * 2 + 2;
    if (child >= h->count)
        return -1;
    return child;
}

// get max element
int max_ele(Max_heap *h)
{
    if (h->count == 0)
        return -1;
    return h->array[0]; // root element of the heap or first element in the array
}

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

// heapifying element - means make the tree follow the property of heap
// two ways, precolate down(use when removing element) or precolate up(when inserting element)
void precolat_down(Max_heap *h, int i)
{
    // till children bigger than element:
    // swap the element with the maximum of its childern
    int l, r, max;
    l = left_child(h, i);
    r = right_Child(h, i);

    if (l != -1 && h->array[l] > h->array[i])
        max = l;
    else
        max = i;
    if (r != -1 && h->array[r] > h->array[max])
        max = r;

    if (max != i)
    {
        swap(h->array[i], h->array[max]);
        precolat_down(h, max);
    }

    // cout<<"check";
}

// delete max means it will delete the root from the heap representation
// implentation
// copy the first element of array into some other variable
// swap the first element with the last element of array
// decrease the count by 1
// heapify the first element
int delete_max(Max_heap *h)
{
    if (h->count <= 0)
        return -1;
    int ele = h->array[0];
    h->array[0] = h->array[h->count - 1];
    h->count--;
    precolat_down(h, 0);
    return ele;
}

void resize_heap(Max_heap *h){
    int *old_arr = h->array;
    h->array = new int[h->capacity*2];
    for(int i = 0;i<h->capacity;i++){
        h->array[i] = old_arr[i];
    }
    h->capacity*=2;
}
void insert(Max_heap *h, int ele){
    if(h->capacity==h->count){
        resize_heap(h);
    }
    h->count++;
    int i;
    i = h->count-1;
    // prelocating up
    while(i>=0&&h->array[parent(h,i)]<ele){
        h->array[i] = h->array[parent(h,i)];
        i = parent(h,i);
    }
    h->array[i]=ele;
}

void print_heap(Max_heap *h)
{
    for (int i = 0; i < h->count; i++)
    {
        cout << h->array[i] << " ";
    }
    cout << endl;
}

int main()
{
    Max_heap *h1 = create(7);
    // int arr[] = {17,13,6,1,4,2,5};
    int arr[] = {1,2,5,17,4,13,6};
    int n = sizeof(arr)/sizeof(int);
    for(int i = 0;i<n;i++){
        insert(h1,arr[i]);
    }
    print_heap(h1);
    cout<<endl;
}