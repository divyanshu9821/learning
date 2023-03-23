#include <iostream>
#include "treeTemplate.cpp"
using namespace std;

void insert(nodeT *&root, int data)
{
    nodeT *temp = root;
    nodeT *nnode = new nodeT();
    nnode->data = data;
    if (!temp)
    {
        // root = new nodeT();
        root = nnode;
        return;
    }
    while (temp)
    {
        if (data < temp->data)
        {
            if (temp->left)
                temp = temp->left;
            else{
                temp->left = nnode;
                return;
            }
        }
        else
        {
            if (temp->right)
                temp = temp->right;
            else{
                temp->right = nnode;
                return;
            }
        }
    }
}

void preOrder(nodeT *root){
    if(root){
        cout<<root->data<<" ";
        preOrder(root->left);
        preOrder(root->right);
    }
}

// this gives the sorted elements
void inOrder(nodeT *root)
{
    if (root)
    {
        inOrder(root->left);
        cout << root->data << " ";
        inOrder(root->right);
    }
}

nodeT *find_max(nodeT *root){
    while(root->right) root=root->right;
    return root;
}

nodeT *delete_node(nodeT *root,int data){
    nodeT *temp = NULL;
    if(root==NULL) cout<<"No node to delete"<<endl;
    else if(data<root->data) root->left=delete_node(root->left,data);
    else if(data>root->data) root->right=delete_node(root->right,data);
    else{
        if(root->left && root->right){
            temp = find_max(root->left);
            root->data = temp->data;
            root->left = delete_node(root->left,root->data);
        }
        else{
            temp = root;
            if(!root->left)
                root = root->right;
            else
                root = root->left;
            free(temp);        
        }
    }
    return root;
}


nodeT *create(int arr[], int n)
{
    nodeT *tree = NULL;
    for (int i = 0; i < n; i++)
    {
        insert(tree, arr[i]);
    }
    return tree;
}
int main()
{
    int arr[5] = {5, 3, 7, 6, 8};
    nodeT *tree = NULL;
    tree = create(arr, 5);
    level_order_traversal(tree);
    preOrder(tree);
    cout<<endl;
    tree=delete_node(tree,7);
    // insert(tree,5);
    // insert(tree,4);
    // insert(tree,2);
    // insert(tree,1);
    // insert(tree,3);
    // preOrder(tree);
    // cout<<endl;
    preOrder(tree);
    inOrder(tree);
    cout<<endl;
}