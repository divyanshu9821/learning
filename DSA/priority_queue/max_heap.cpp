// priority_queue is the ADT
// implemented using max_heap
// get max - get the maximum element from the heap which is root in max heap
// delete max - return the maximum element and delete it from heap
// insert - insert element into heap

#include<iostream>
using namespace std;

// sturucture of heap
struct Heap{
    int *array; // using array to store element
    int count; // #elements in array
    int capacity; // size of array
    int heap_type; // min_heap or max_heap
};

// create heap
Heap *create(int capacity, int heap_type){
    Heap *h = new Heap(); // create a new heap
    h->capacity = capacity; // set heap capacity
    h->heap_type = heap_type; // set heap type
    h->count = 0; // initalize count
    h->array = new int[h->capacity]; // allocating memory to array = capacity
    return h;
}

// get parent of that node it will be at (i-1)/2
int parent(Heap *h, int i){
    if(i<=0||h>=h->count) return -1;
    else return (i-1)/2;
}

// get children they will be at i*2+1, i*2+2
int leftchild(Heap *h, int i){
    int child = i*2+1;
    if(child>=h->count) return -1;
    return child;
}

int rightChild(Heap *h, int i){
    int child = i*2+2;
    if(child>=h->count) return -1;
    return child;
}

// get max element
int max_ele(Heap *h){
    if(h->count==0) return -1;
    return h->array[0]; // root element of the heap or first element in the array
}