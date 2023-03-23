#include <iostream>
#include "treeTemplate.cpp"
using namespace std;

int search(int inOrder[], int inOrderStart, int inOrderEnd, int val)
{
    for (int i = inOrderStart; i <= inOrderEnd; i++)
        if (inOrder[i] == val)
            return i;
    return 0;
}

nodeT *create(int inOrder[], int preOrder[], int inOrderStart, int inOrderEnd)
{
    static int preOrderIndex = 0;
    nodeT *newNode;
    if (inOrderStart > inOrderEnd)
        return NULL;
    newNode = new nodeT();
    
    if(!newNode){
        cout<<"Memory error"<<endl;
        return NULL;
    }
    
    newNode->data = preOrder[preOrderIndex];
    preOrderIndex++;
    if (inOrderStart == inOrderEnd)
        return newNode;
    int inOrderIndex = search(inOrder, inOrderStart, inOrderEnd, newNode->data);
    newNode->left = create(inOrder, preOrder, inOrderStart, inOrderIndex - 1);
    newNode->right = create(inOrder, preOrder, inOrderIndex + 1, inOrderEnd);
    return newNode;
}

int main()
{
    int inOrder[] = {3, 1, 4, 0, 5, 2};
    int preOrder[] = {0, 1, 3, 4, 2, 5};
    nodeT *tree = new nodeT();
    tree = create(inOrder, preOrder, 0,5);
    level_order_traversal(tree);
}
