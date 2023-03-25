// priority_queue is the ADT
// implemented using max_heap
// get max - get the maximum element from the heap which is root in max heap
// delete max - return the maximum element and delete it from heap
// insert - insert element into heap

// property of heap - element is bigger than its children(max heap) or element is smaller than its children(min heap)

#include <iostream>
using namespace std;

// sturucture of heap
struct Heap
{
    int *array;    // using array to store element
    int count;     // #elements in array
    int capacity;  // size of array
    int heap_type; // min_heap or max_heap
};

// create heap
Heap *create(int capacity, int heap_type)
{
    Heap *h = new Heap();            // create a new heap
    h->capacity = capacity;          // set heap capacity
    h->heap_type = heap_type;        // set heap type
    h->count = 0;                    // initalize count
    h->array = new int[h->capacity]; // allocating memory to array = capacity
    return h;
}

// get parent of that node it will be at (i-1)/2
int parent(Heap *h, int i)
{
    if (i <= 0 || h >= h->count)
        return -1;
    else
        return (i - 1) / 2;
}

// get children they will be at i*2+1, i*2+2
int left_child(Heap *h, int i)
{
    int child = i * 2 + 1;
    if (child >= h->count)
        return -1;
    return child;
}

int right_Child(Heap *h, int i)
{
    int child = i * 2 + 2;
    if (child >= h->count)
        return -1;
    return child;
}

// get max element
int max_ele(Heap *h)
{
    if (h->count == 0)
        return -1;
    return h->array[0]; // root element of the heap or first element in the array
}

void swap(int *a, int *b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

// heapifying element - means make the tree follow the property of heap
// two ways precolate down(use when removing element) or precolate up(when inserting element)
void precolat_down(Heap *h, int i)
{
    // till children bigger than element:
    //     swap the element with the maximum of its childern
    int l, r, max;
    l = left_child(h, i);
    r = right_Child(h, i);
    if (l != -1 && h->array[l] > h->array[i])
        max = l;
    else
        max = i;
    if (r != -1 && h->array[r] > h->array[max])
        max = r;
    if(max!=i){
        swap(h->array[i],h->array[max]);
    }
    precolat_down(h, max);   
}