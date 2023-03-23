#include<iostream>
using namespace std;

struct node{
    int data;
    node *next = NULL;
};

node *create_stack(){
    return NULL;
}

void push(node **top,int data){
    node *new_node = new node();
    new_node->data = data;
    new_node->next = *top;
    *top = new_node;    
}

bool is_stack_empty(node *top){
    return (top==NULL);
}

int pop(node **top){
    if(!is_stack_empty(*top)){
        node *tmp = *top;
        int data = tmp->data;
        *top = tmp->next;
        delete(tmp);
        return data;
    }
    else 
        cout<<"Stack underflow"<<endl;
        return -100000;
}

int top(node *top){
    if(is_stack_empty(top))
        cout<<"Empty"<<endl;
    return top->data;
}

int main()
{
    // Start coding
    node *stack = create_stack();
    push(&stack,10);
    // push(&stack,11);
    // push(&stack,12);
    // push(&stack,13);

    // node *stack2 = create_stack();
    // push(&stack2,1);
    // push(&stack2,2);
    // push(&stack2,3);
    // push(&stack2,4);

    cout<<top(stack);
    
    return 0;
}