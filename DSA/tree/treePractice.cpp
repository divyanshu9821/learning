#include <iostream>
#include "treeTemplate.cpp" // defined by me
using namespace std;

void in_order_traversal(nodeT *root); // without recursion
int nodes(nodeT *root);
bool find_ele(nodeT *root, int ele);
void reverse_level_order(nodeT *root);
int tree_height(nodeT *root);
int diameter(nodeT *root);
void printrootleaf(nodeT *tree, int arr[], int arrLen);
void printArr(int arr[], int arrLen);
void print_zig_zag(nodeT *tree);
int printAncestors(nodeT *root, nodeT *node);

//----------------------------------------------------------
int main()
{
    nodeT* tree = create_tree();
    // reverse_level_order(tree);
    // cout<<tree_height(tree)<<endl;

    // nodeT *one = create_tree_node(1);
    // nodeT *two = create_tree_node(2);
    // nodeT *three = create_tree_node(3);
    // nodeT *four = create_tree_node(4);
    // nodeT *five = create_tree_node(5);
    // nodeT *six = create_tree_node(6);
    // nodeT *seven = create_tree_node(7);
    // nodeT *eight = create_tree_node(8);
    // nodeT *nine = create_tree_node(9);
    //
    // one->left = two;
    // one->right = three;
    // three->left = four;
    // three->right = five;
    // five->left = six;
    // five->right = seven;
    // six->left = eight;
    // six->right = nine;
    //
    // int arr[9];
    // int arrLen = 0;
    //
    // printrootleaf(one,arr,arrLen);
    print_zig_zag(tree);
    // nodeT *po = tree->right->left->right->left->left->left;
    // printAncestors(tree,po);
}
//----------------------------------------------------------

int printAncestors(nodeT *root,nodeT *node){
    if(!root) return 0;
    if(root->left==node||root->right==node||printAncestors(root->left,node)||printAncestors(root->right,node)){
        cout<<root->data<<" ";
        return 1;
    }
    return 0;
}

void print_zig_zag(nodeT *root)
{
    stack *s = create_stack_node();
    queue *q = create_queue_node();
    enqueue(q, root);
    enqueue(q, NULL);
    int flip = 0;
    while (q->front)
    {
        nodeT *temp = dequeue(q);
        if (temp)
        {
        
        
            if (flip == 0)
                cout << temp->data << " ";
            else{
                push(s, temp);
            }

        if (temp->left)
            enqueue(q, temp->left);
        if (temp->right)
            enqueue(q, temp->right);
        }

        else{
            // cout<<"push"<<endl;
            (flip) ? flip = 0 : flip = 1;
            if(q->front)
                enqueue(q, NULL);
            while (s->top)
                cout << pop(s)->data << " ";
        }
    }
}

int diameter(nodeT *root)
{
    if (!root)
        return 0;
    int lh = tree_height(root->left);
    int rh = tree_height(root->right);
    int ld = diameter(root->left);
    int rd = diameter(root->right);
    return max(lh + rh + 1, max(ld, rd));
}

int tree_height(nodeT *tree)
{
    if (!tree)
        return 0;
    return 1 + max(tree_height(tree->left), tree_height(tree->right));
}

void reverse_level_order(nodeT *root)
{
    stack *s = create_stack_node();
    queue *q;
    q = create_queue_node();
    enqueue(q, root);
    while (q->front)
    {
        nodeT *tmp = dequeue(q);
        if (tmp->left)
            enqueue(q, tmp->left);
        if (tmp->right)
            enqueue(q, tmp->right);
        push(s, tmp);
    }
    while (s->top)
    {
        cout << pop(s)->data << endl;
    }
}

bool find_ele(nodeT *root, int ele)
{
    if (root)
    {
        if (root->data == ele)
            return true;
        else
        {
            bool tmp = find_ele(root->left, ele);
            if (tmp)
                return tmp;
            else
                return find_ele(root->right, ele);
        }
    }
    return false;
}

int nodes(nodeT *root)
{
    if (!root)
        return 0;
    return nodes(root->left) + 1 + nodes(root->right);
}

void in_order_traversal(nodeT *root)
{
    stack *s = create_stack_node();
    while (1)
    {
        while (root)
        {
            push(s, root);
            root = root->left;
        }
        if (s->top == NULL)
            break;
        root = pop(s);
        std::cout << root->data << std::endl;
        root = root->right;
    }
    delete_stack(s);
}

void printrootleaf(nodeT *tree, int arr[], int arrLen)
{
    if (!tree)
        return;
    arr[arrLen] = tree->data;
    arrLen++;
    if (!tree->left && !tree->right)
        printArr(arr, arrLen);
    else
    {
        printrootleaf(tree->left, arr, arrLen);
        printrootleaf(tree->right, arr, arrLen);
    }
}

void printArr(int arr[], int arrLen)
{
    for (int i = 0; i < arrLen; i++)
        cout << arr[i] << " ";
    cout << endl;
}