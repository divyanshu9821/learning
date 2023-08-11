#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head = NULL;

void addFirst(int data)
{
    struct node* newNode = (struct node *)malloc(sizeof(struct node));
    newNode->data = data;
    newNode->next = head;
    head = newNode;
}

void print(){
    struct node* currNode = (struct node* )malloc(sizeof(struct node));
    currNode = head;
    while(currNode!=NULL){
        printf("%d",currNode->data);
        currNode = currNode->next;
    }
}

int main()
{
    addFirst(5);
    addFirst(6);
    addFirst(7);
    addFirst(8);
    print();
}