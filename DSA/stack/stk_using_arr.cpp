#include<iostream>
using namespace std;

// user defined function
#define MAX_SIZE 10

struct array_stack{
    int top;
    int capacity;
    int *array;
};

array_stack *createStack(){
    struct array_stack *s = new array_stack();
    if(!s)
        return NULL;
    s->capacity = MAX_SIZE;
    s->top = -1;
    s->array = new int[s->capacity]; 
    if(!s->array)
        return NULL;
    return s;       
}

// is_stack_Empty
bool is_stack_Empty(array_stack *s){
    return (s->top == -1);
}
// is_stack_full 
bool is_stack_full(array_stack *s){
    return (s->top==s->capacity-1);
}

// push
void push(array_stack *s, int data){
    if(!is_stack_full(s))
        s->array[++s->top] = data;
    else
        cout<<"Stack overflow"<<endl;
}
// pop 
int pop(array_stack *s){
    if(!is_stack_Empty(s))
        return (s->array[s->top--]);
    else{
        cout<<"Stack underflow"<<endl;
        return -1000000;
    }
}
// top
int top(array_stack *s){
    return s->top;
}

// delete stack
void delete_stack(array_stack *s){
    if(s){
        if(s->array)
            delete(s->array);
        delete(s);    
    }
}

int main()
{
    array_stack *s = createStack();
    push(s,10);
    push(s,10);
    push(s,10);
    push(s,10);
    push(s,10);
    array_stack *t = createStack();
    push(t,11);
    push(t,11);
    push(t,11);
    push(t,11);
    push(t,11);

    for(int i = 0;i<10;i++){
        cout<<pop(s)<<endl;
    }

    cout<<endl;
    for(int i = 0;i<10;i++){
        cout<<pop(t)<<endl;
    }

    // Start coding

    return 0;
}