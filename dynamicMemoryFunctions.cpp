#include <iostream>
using namespace std;
int main(){
    int a = 10;//store in stack
    int *p = new int();//allocate memory in heap
    
    *p = 10;//p variable is store in 'stack' that point the 10 which will store in 'heap'.
    delete(p);//deallocate the pointer now it becomes dangling means point to the memory location that has garbage value.
    //but p variable is still in the stack so we have two options here 
    //reuse that p variable 
    //remove it from the stack
    
    p = new int[4];//reusing p variable to point the array of size four in heap.
    delete[] p;//deallocating again.
    
    p = NULL;//now it will not point to the specific location in heap.


    return 0;
}