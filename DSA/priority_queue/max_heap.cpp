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