#include <iostream>
using namespace std;

struct llnode
{
    int data;
    llnode *next = NULL;
};

void insert_node(llnode **head, int position, int data)
{
    int k = 1;
    llnode *new_node, *p, *q; // pointers: new_node for new node, p for previous node, q for next node to p
    new_node = new llnode();  // allocate memory for new node
    // after allocating space the pointer will return true, if not allocated properly return false
    if (!new_node)
    {
        // if not allocated then there is unsufficient memory
        cout << "Memory error" << endl;
        return;
    }

    new_node->data = data; // set data in newnode
    p = *head;             // p store element that head is pointed

    // insert at beginnning
    if (position == 1)
    {
        new_node->next = p; // new node points to the p which is storing the head
        *head = new_node;   // head is point to the new node
    }
    else
    {
        // traverse till till position where we want to insert newnode
        while (p != NULL && k < position) // k is to check that the position is rechable or out of bound
        {
            k++;
            q = p;
            p = p->next;
        }

        if(k!=position){
            cout<<"Invalid position"<<endl;
            return;
        }


        // we want to insert element in between the position element and the element prior to the position
        q->next = new_node; // now q is pointing to the element which is prior to the position
        new_node->next = p; // p is pointing to the element which is at postion
    }
    p = NULL;
    q = NULL;
    new_node = NULL;
    delete (p);
    delete (q);
    delete (new_node);
}

void remove_node(llnode **head, int position)
{
    int k = 1;
    llnode *p, *q;
    if (*head == NULL)
    {
        cout << "List is Empty" << endl;
        return;
    }

    p = *head;
    if (position == 1)
    {
        *head = (*head)->next;
        delete (p);
        return;
    }

    while (p != NULL && k < position)
    {
        k++;
        q = p;
        p = p->next;
    }

    if (p == NULL)
        cout << "Location does not exists" << endl;
    else
    {
        q->next = p->next;
    }
    p = NULL;
    q = NULL;
    delete (p);
    delete (q);
}

int list_length(llnode *head)
{
    llnode *current = head;
    int count = 0;
    while (current != NULL)
    {
        count++;
        current = current->next;
    }
    return count;
}

void print_list(llnode *head)
{
    if (head == NULL)
    {
        cout << "Empty list" << endl;
    }
    llnode *current = head;
    while (current != NULL)
    {
        cout << current->data << " ";
        current = current->next;
    }
    cout << endl;
    return;
}

int main()
{

    struct llnode *l1 = NULL;
    insert_node(&l1, 1, 1);
    insert_node(&l1, 2, 2);
    insert_node(&l1, 3, 3);
    insert_node(&l1, 4, 4);
    // remove_node(&l1, 1);
    // remove_node(&l1, 1);
    // remove_node(&l1, 1);
    // remove_node(&l1, 1);

    // print_list(l1);
    // cout << list_length(l1) << endl;

    return 0;
}