#include <iostream>
using namespace std;

// Data structure contain data and a i
struct node
{
    int data;          // store the data of type int
    struct node *next; // store the i to the same type of structure
};

struct list
{
    node *head = NULL; // i to the first element of list
    node *tail = NULL; // i to the last element of list
};

// insert a node at the front of list
void push_front(node **head, int data)
{
    // create a new node
    node *new_node = new node();
    // set data in new node
    new_node->data = data;
    // point the new node to the head element
    new_node->next = *head; // first time new Node will point to NULL
    // make new node head element
    *head = new_node;
    // new node added to the list
    return;
}

// insert a node at the end of list
void push_back(node **head, node **tail, int data)
{
    // in case list is empty
    if (*head == NULL)
    {
        // this is require only for first time as push_back funtion only require tail i for the rest but we need head to track list
        push_front(head, data);
        *tail = *head; // first time tail and head are pointing to the same node
        return;
    }

    // in case there is atleast one element in list

    // create a new node
    node *new_node = new node();
    // set the data in new node
    new_node->data = data;
    // point the new node to null
    new_node->next = NULL;
    // point the tail element to new node
    (*tail)->next = new_node;
    // make the new node tail element
    *tail = new_node;
    // new node is added to list
    return;
}

// insert a node at 'ith' position (0 based indexing)
void push_at(node **head, node **tail, int position, int data)
{
    int k = 1;
    if (position < k)
    {
        cout << "Out of bound" << endl;
        return;
    }

    if (position == 1)
    {
        push_front(head, data);
        return;
    }

    node *prev_i = NULL;
    node *i = *head;
    node *new_node = new node();
    new_node->data = data;

    while (i != NULL && position > k)
    {
        k++;
        prev_i = i;
        i = i->next;
    }

    prev_i->next = new_node;
    new_node->next = i;

    if (position >= k && i == NULL)
    {
        *tail = new_node;
    }

    if (position > k)
    {
        cout << "Out of bound" << endl;
    }

    i = NULL;
    prev_i = NULL;
    delete (i);
    delete (prev_i);
    return;
}

// remove a node from front of list
void pop_front(node **head)
{
    if (*head == NULL)
    {
        cout << "No element to pop as list is Empty" << endl;
        return;
    }
    *head = (*head)->next; // previous element pointed by head doesnot remove from its location make it a grabage that is collected by the garbage collector

    // a node is removed from the front
    return;
}

// remove a node from back of list
void pop_back(node **head, node **tail)
{
    if (head == NULL)
    {
        cout << "No element to pop as list is Empty" << endl;
        return;
    }

    // if we remove element from the last it always traverse the list
    node *i = *head;
    while (i->next != *tail)
    {
        i = i->next;
    }
    *tail = i;
    i->next = NULL;
    // a node is removed from the back

    i = NULL;
    delete (i);
    return;
}

// remove from the 'ith' position (0 based indexing)
void pop_at(node **head, node **tail, int position)
{
    int k = 1;
    if (position < k)
    {
        cout << "out of bound" << endl;
        return;
    }

    if (position == 1)
    {
        pop_front(head);
        return;
    }

    node *prev_i = NULL;
    node *i = *head;

    while (k < position && i != NULL)
    {
        k++;
        prev_i = i;
        i = i->next;
    }

    if(i!=NULL){
        prev_i->next = i->next;    
        if(i->next == NULL){
            *tail = prev_i;
        }
    }else
        *tail = prev_i;

    if(position!=k){
        cout<<"out of bound"<<endl;
    }
    prev_i = NULL;
    i = NULL;
    delete (i);
    delete (prev_i);
    return;
}

// print the list
void print_list(node *head)
{
    node *i = head;
    if (i == NULL)
    {
        cout << "Empty list" << endl;
        return;
    }
    while (i != NULL)
    {
        cout << i->data << " ";
        i = i->next;
    }
    cout << endl;
    i = NULL;
    delete (i);
    return;
}

// returns the size of list
int size_of_list(node *head)
{
    node *current = head;
    int count = 0;
    while (current != NULL)
    {
        count++;
        current = current->next;
    }
    return count;
}

int main()
{
    // push_back, push_front, push_at, pop_front, pop_back, pop_at, print_list, size_of_list

    list l1;
    push_back(&l1.head, &l1.tail, 1); // 1
    push_back(&l1.head, &l1.tail, 2); // 1 2

    push_front(&l1.head, 3); // 3 1 2
    push_front(&l1.head, 4); // 4 3 1 2

    pop_back(&l1.head, &l1.tail); // 4 3 1

    pop_front(&l1.head); // 3 1

    push_at(&l1.head, &l1.tail, 3, 10); // 3 1 10
    push_at(&l1.head, &l1.tail, 2, 5);  // 3 5 1 10
    push_at(&l1.head, &l1.tail, 2, 7);  // 3 7 5 1 10
    push_at(&l1.head, &l1.tail, 4, 6);  // 3 7 5 6 1 10
    // push_at(&l1.head, &l1.tail, -1, 10); // out of bound
    push_at(&l1.head, &l1.tail, 6, 78); // 3 7 5 6 1 78 10
    push_at(&l1.head, &l1.tail, 8, 2);  // 3 7 5 6 1 78 10 2
    push_at(&l1.head, &l1.tail, 1, 5);  // 5 3 7 5 6 1 78 10 2

    pop_at(&l1.head, &l1.tail, 6); // 5 3 7 5 6 78 10 2
    // pop_at(&l1.head, &l1.tail, -1); // out of bound
    pop_at(&l1.head, &l1.tail, 10); // out of bound
    pop_at(&l1.head, &l1.tail, 1);  // 3 7 5 6 78 10 2
    cout << l1.head->data << " " << l1.tail->data << endl;
    print_list(l1.head);
    cout << size_of_list(l1.head) << endl;

    return 0;
}