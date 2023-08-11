// circular linkedlist
#include <iostream>
using namespace std;

struct cllnode
{
    int data;
    cllnode *next;
};

// insert new node at the back of list
void insert_back(cllnode **head, int data)
{
    cllnode *new_node = new cllnode(); // creating new node
    new_node->data = data;             // inserting data in new node
    // incase list is empty
    if (*head == NULL) // head is pointing to null
    {
        new_node->next = new_node; // newnode will point to itself
        *head = new_node;          // head will point to new node
        return;
    }

    cllnode *p = *head; // creating a pointer p and it is pointing to head node
    do
    {                             // run compulsory first time even if condition does not satisfy
        p = p->next;              // traverse
    } while (p->next != (*head)); // until p is pointing to head node

    p->next = new_node;     // node at p will point to new node
    new_node->next = *head; // new node will point to head node

    p = NULL;          // deallocating p pointer
    new_node = NULL;   // deallocating newnode pointer
    delete (p);        // deleting p pointer
    delete (new_node); // deleting newnode pointer
}

// insert new node at the front of list
void insert_front(cllnode **head, int data)
{
    cllnode *new_node = new cllnode();
    new_node->data = data;
    if (*head == NULL)
    {
        new_node->next = new_node;
        *head = new_node;
        return;
    }

    cllnode *p = *head;
    while (p->next != *head)
    {
        p = p->next;
    }

    new_node->next = *head;
    *head = new_node;
    p->next = *head;

    p = NULL;
    new_node = NULL;
    delete (p);
    delete (new_node);
}

// delete node at front of list
void delete_front(cllnode **head)
{

    // incase list is empty
    if (*head == NULL)
    {
        cout << "list is empty" << endl;
        return;
    }

    // incase list has only one element
    if ((*head)->next == *head)
    {
        *head = NULL;
        delete (head);
        return;
    }

    cllnode *p = *head;
    while (p->next != *head)
    {
        p = p->next;
    }

    p->next = (*head)->next; // p point to the node next to head node
    *head = (*head)->next; // node next to head node becomes head node

    p = NULL; // deallocation
    delete (p); // deletion
}

// delete node at back of list
void delete_back(cllnode **head)
{
    // incase list is empty
    if (*head == NULL)
    {
        cout << "list is empty" << endl;
        return;
    }

    // incase list has only one element
    if ((*head)->next == *head)
    {
        *head = NULL;
        delete (head);
        return;
    }

    cllnode *p = *head; // pointer p will point to the head node
    while (p->next->next != *head) // loop util p's next node's next pointer is NULL
    {
        p = p->next; // traverse
    }

    p->next = *head; // p will point to the head node
    p = NULL; // deallocation
    delete (p); // deletion
    return;
}

// print_list
void cll_print(cllnode *head)
{
    if (head == NULL)
    {
        return;
    }
    cllnode *curr = head;
    do
    {
        cout << curr->data << " ";
        curr = curr->next;
    } while (curr != head);
    cout << endl;
    return;
}

// length of list
int cll_length(cllnode *head)
{
    if (head == NULL)
    {
        return 0;
    }
    cllnode *curr = head;
    int count = 0;
    do
    { // need to run at least ones because curr point to the head in starting
        count++;
        curr = curr->next;
    } while (curr != head);
    return count;
}

int main()
{

    // Start coding
    cllnode *cll1 = NULL;
    insert_front(&cll1, 1); // 1
    insert_back(&cll1, 2);  // 1 2
    insert_front(&cll1, 3); // 3 1 2
    insert_back(&cll1, 4);  // 3 1 2 4
    insert_front(&cll1, 5); // 5 3 1 2 4
    delete_front(&cll1);    // 3 1 2 4
    insert_back(&cll1, 6);  // 3 1 2 4 6
    delete_front(&cll1);    // 1 2 4 6
    insert_front(&cll1, 7); // 7 1 2 4 6
    delete_back(&cll1);     // 7 1 2 4
    insert_back(&cll1, 8);  // 7 1 2 4 8
    insert_front(&cll1, 9); // 9 7 1 2 4 8
    insert_back(&cll1, 9);  // 9 7 1 2 4 8 9
    delete_back(&cll1);     // 9 7 1 2 4 8
    cll_print(cll1);
    cout << cll_length(cll1) << endl;
    return 0;
}