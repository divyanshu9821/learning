// doubly linkedlist
#include <iostream>
using namespace std;

struct dllnode
{
    int data;
    dllnode *prev = NULL;
    dllnode *next = NULL;
};

// insert new node
void insert_node(dllnode **head, int position, int data) // dual pointer to the head because we want to change the head position not in the called function but also in the calling function
{
    int k = 1;                // to keep the record of how many nodes we traverse
    dllnode *new_node, *p;    // *p pointer to the node
    new_node = new dllnode(); // allocate space of node to a newnode
    new_node->data = data;    // putting data in new node
    p = *head;                // pointer to the head node

    // if we want to push the node in starting
    if (position == 1)
    {
        new_node->next = p;     // new node will point to the p which is head node in this case
        if (p)                  // if p is not null
            p->prev = new_node; // than new node will pointed by the p node in doubly ll
        // incase if p is null means list is empty
        *head = new_node; // than simply point the head to the new node
        p = NULL;         // deallocating p pointer
        delete (p);       // deleting the p pointer
        return;
    }

    // incase of list is empty and we want to insert node at position other than 1 than there is something wrong with us :)
    if (p == NULL)
    {
        cout << "position no reachable" << endl;
        return;
    }

    // for inserting node other than first position
    while ((p->next) != NULL && k < (position - 1)) // condition is to stop traversing one node before the position as we need to allocate pointer of that node to the new node
    {
        k++;         // this will track which node we are at from the head or start of the list
        p = p->next; // traverse
    }

    // this condition is to give the warning that the position we are trying to access is not rechagble by traversing the linked nodes
    if (k != position - 1)
    {
        cout << "incorrect position" << endl;
        return;
    }

    new_node->next = p->next;     // newnode next pointer will point to the next pointer of p
    new_node->prev = p;           // newnode previous pointer will point the point
    if (p->next != NULL)          // incase of inserting node at last position we skip this, as null is a value not a node or some pointer
        p->next->prev = new_node; // prev pointer of next node to p will point to the new node
    p->next = new_node;           // next pointer of p will point to the new node
    return;
}

// delete node
void delete_node(dllnode **head, int position)
{
    if (*head == NULL) // if head is not pointing to any node means the list is empty
    {
        cout << "List is empty" << endl;
        return;
    }
    int k = 1;         // track the number of nodes traversed
    if (position == 1) // incase of deleting node from starting
    {
        *head = (*head)->next; // head will point to its next element
        (*head)->prev = NULL;  // node which is now pointed by head also holds an address in prev pointer that is not of use
        return;
    }

    dllnode *p = *head; // pointer p is pointing to the head node
    while (p->next != NULL && k < position)
    {
        k++;
        p = p->next;
    }

    if (k != position)
    { // condition when try to reach node that is not present means passing the position bigger than length of list
        cout << "incorrect position" << endl;
        return;
    }
    if (p->next != NULL)         // incase of last node we skip this
        p->next->prev = p->prev; // next element to p will point to the previous element to p

    p->prev->next = p->next; // previous element to the element we want to delete will point to the next element to it

    p = NULL;
    delete (p);
    return;
}

// printing the linkedlist
void print_dll(dllnode *head)
{
    if (head == NULL)
    {
        cout << "Empty list" << endl;
        return;
    }
    dllnode *i = head;
    while (i != NULL)
    {
        cout << i->data << " ";
        i = i->next;
    }
    cout << endl;
}

// length of list
int dll_length(dllnode *head)
{
    dllnode *curr = head;
    int count = 0;
    while (curr != NULL)
    {
        count++;
        curr = curr->next;
    }
    return count;
}

int main()
{

    // Start coding
    dllnode *dll1 = NULL;
    insert_node(&dll1, 1, 10); // 10
    insert_node(&dll1, 2, 20); // 10 20
    insert_node(&dll1, 3, 30); // 10 20 30
    // insert_node(&dll1, 7, 40); // incorrect position
    insert_node(&dll1, 2, 40); // 10 40 20 30
    insert_node(&dll1, 3, 50); // 10 40 50 20 30
    insert_node(&dll1, 5, 60); // 10 40 50 20 60 30
    insert_node(&dll1, 7, 70); // 10 40 50 20 60 30 70

    delete_node(&dll1, 1); // 40 50 20 60 30 70
    delete_node(&dll1, 6); // 40 50 20 60 30
    delete_node(&dll1, 4); // 40 50 20 30
    // delete_node(&dll1, 10); // incorrect position
    delete_node(&dll1, 2); // 40 20 30

    print_dll(dll1);
    cout << dll_length(dll1) << endl;

    return 0;
}