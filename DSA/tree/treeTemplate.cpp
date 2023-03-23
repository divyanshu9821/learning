#include<iostream>

struct nodeT
{
    int data;
    nodeT *right = NULL;
    nodeT *left = NULL;
};

struct nodeL
{
    nodeT *data = NULL;
    nodeL *next = NULL;
};

struct queue
{
    nodeL *front = NULL;
    nodeL *rear = NULL;
};

struct stack
{
    nodeL *top = NULL;
};

nodeT *create_tree_node(int data)
{
    nodeT *tmp = new nodeT();
    tmp->data = data;
    if (!tmp)
        return NULL;
    return tmp;
}

queue *create_queue_node()
{
    queue *tmp;
    tmp = new queue();
    if (!tmp)
        return NULL;
    return tmp;
}

stack *create_stack_node()
{
    stack *tmp;
    tmp = new stack();
    if (!tmp)
        return NULL;
    return tmp;
}

void push(stack *s, nodeT *root)
{
    nodeL *lnode = new nodeL();
    lnode->data = root;
    lnode->next = s->top;
    s->top = lnode;
}

nodeT *pop(stack *s)
{
    if (!s->top)
    {
        std::cout << "Stack is empty" << std::endl;
        return NULL;
    }
    nodeT *tnode = s->top->data;
    nodeL *tmp = s->top;
    s->top = s->top->next;
    delete (tmp);
    return tnode;
}

void delete_stack(stack* s){
    while(s->top){
        pop(s);
    }
    delete(s);
}

void enqueue(queue *q, nodeT *root)
{
    nodeL *lnnode = new nodeL();
    lnnode->data = root;
    if (q->rear == NULL)
    {
        q->front = lnnode;
        q->rear = lnnode;
    }
    else
    {
        q->rear->next = lnnode;
        q->rear = lnnode;
    }
}

nodeT *dequeue(queue *q)
{
    if (q->rear == NULL)
    {
        std::cout << "Q is Empty" << std::endl;
        return NULL;
    }
    nodeL *tmp = q->front;
    nodeT *treeNode = tmp->data;
    q->front = q->front->next;
    if (q->front == NULL)
        q->rear = NULL;
    delete(tmp);    
    return treeNode;
}

void delete_queue(queue* q){
    while(q->rear || q->front){
        dequeue(q);
    }
    delete(q);
}

void insert_level_order(nodeT *root, int data)
{
    nodeT *tnnode = create_tree_node(data);
    nodeT *tmp;
    if (!root)
    {
        root = tnnode;
        return;
    }

    queue *q = create_queue_node();
    enqueue(q, root);
    while (q->rear != NULL)
    {
        tmp = dequeue(q);
        if (tmp->left)
            enqueue(q, tmp->left);
        else
        {
            tmp->left = tnnode;
            delete_queue(q);
            return;
        }

        if (tmp->right)
            enqueue(q, tmp->right);
        else
        {
            tmp->right = tnnode;
            delete_queue(q);
            return;
        }
    }
    delete_queue(q);
}

nodeT *create_tree()
{
    nodeT *tree = create_tree_node(1);
    std::cout << "Enter Nodes in tree" << std::endl;
    int n;
    std::cin >> n;
    for (int i = 2; i <= n; i++)
    {
        insert_level_order(tree, i);
    }
    return tree;
}

void level_order_traversal(nodeT *root)
{
    queue *q = create_queue_node();
    if (!root)
    {
        std::cout << "empty tree" << std::endl;
        return;
    }

    enqueue(q, root);
    while (q->rear != NULL)
    {
        nodeT *tmp = dequeue(q);
        std::cout << tmp->data <<" ";
        if (tmp->left)
            enqueue(q, tmp->left);
        if (tmp->right)
            enqueue(q, tmp->right);
    }
    delete_queue(q);
    std::cout<<std::endl;
}
