#include <iostream>
using namespace std;

struct node
{
    int data;
    node *next = NULL;
};

struct queue
{
    node *front;
    node *rear;
};

queue *create()
{
    queue *tmp;
    tmp = new queue();
    return tmp;
}

void enqueue(queue *q, int data)
{

    node *new_node;           // create a node
    new_node = new node();    // allocate size
    new_node->data = data;    // set data in newly created node

    // link new node to queue if exists
    if(q->rear)
        q->rear->next = new_node; 
    
    q->rear = new_node;       // set new node as a rear

    // if first node than front and rear is same
    if (q->front == NULL)
        q->front = q->rear;
}

int dequeue(queue *q)
{
    if (q->front == NULL)
    {
        cout << "underflow" << endl;
        return -1;
    }
    int data = q->front->data;
    node *tmp = q->front;
    q->front = q->front->next;
    delete(tmp);
    return data;
}

int main()
{
    queue *q;
    q = create();
    enqueue(q,5);
    enqueue(q,6);
    enqueue(q,7);
    enqueue(q,8);
    cout<<dequeue(q)<<endl;
    cout<<dequeue(q)<<endl;
}