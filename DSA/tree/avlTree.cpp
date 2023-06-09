#include <iostream>
using namespace std;
struct avlNode
{
    int data = 0;
    int height = 0;
    avlNode *left = nullptr;
    avlNode *right = nullptr;
};

int hiet(avlNode *root){
    if(!root) return -1;
    return root->height;
}

// anticlockwise rotation
avlNode *single_rotate_right(avlNode *root)
{
    avlNode *child = root->right;
    root->right = child->left;
    child->left = root;
    child->height = max(hiet(child->left), hiet(child->right)) + 1;
    root->height = max(hiet(root->left), hiet(root->right)) + 1;
    return child;
}

// clockwise rotation
avlNode *single_rotate_left(avlNode *root)
{
    avlNode *child = root->left;
    root->left = child->right;
    child->right = root;
    child->height = max(hiet(child->left), hiet(child->right)) + 1;
    root->height = max(hiet(root->left), hiet(root->right)) + 1;
    return child;
}

avlNode *double_rotate_right(avlNode *root)
{
    root->right = single_rotate_left(root->right);
    root = single_rotate_right(root);
    return root;
}

avlNode *double_rotate_left(avlNode *root)
{
    root->left = single_rotate_right(root->left);
    return single_rotate_left(root);
}

avlNode *insertion(avlNode *root, int data)
{
    if (!root)
    {
        root = new avlNode();
        root->data = data;
        root->height = 0;
    }
    else if (data < root->data)
    {
        root->left = insertion(root->left, data);
        if (hiet(root->left) - hiet(root->right) == 2)
        {
            if (data < root->left->data)
            {
                root = single_rotate_left(root);
            }
            else
            {
                root = double_rotate_left(root);
            }
        }
    }
    else if (data > root->data)
    {
        root->right = insertion(root->right,data);
        if (hiet(root->right) - hiet(root->left) == 2)
        {
            if (data > root->right->data)
            {
                root = single_rotate_right(root);
            }
            else
            {
                root = double_rotate_right(root);
            }
        }
    }
    root->height = max(hiet(root->left), hiet(root->right)) + 1;
    return root;
}

int main(){
    
}