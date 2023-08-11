#include<iostream>
using namespace std;
struct Graph{
    int v; // vertices
    int e; // edges
    bool **adj;
};

Graph *createGraph(){
    Graph *g = new Graph();
    int v,e;
    cout << "No of Vertices? ";
    cin >> v;
    cout << "No of edges? ";
    cin >> e;

    g->v = v;
    g->e = e;

    bool **adj;
    adj = new bool *[v];
    // creating adjacency matrix
    for (int i = 0; i < v; i++)
    {
        adj[i] = new bool[v];
    }

    // initializing adjacency matrix
    for (int i = 0; i < v; i++)
    {
        for (int j = 0; j < v; j++)
        {
            adj[i][j] = false;
        }
    }

    // graph creation
    cout << "Enter two vertices such that A<space>B it means A->B(A has a directed edge to B)"<<endl;
    for (int i = 0; i < e; i++)
    {
        int a;
        int b;
        cout<<"edge: ";
        cin >> a >> b;
        if (a >= v || b >= v)
        {
            cout << "input must be in range(0," << v << ")" << endl;
            return 0;
        }
        adj[a][b] = true;
    }

    g->adj = adj;
    return g;
}

void printAdj(Graph *g){
    int v = g->v;
    for(int i = 0;i<v;i++){
        for(int j = 0;j<v;j++){
            cout<<g->adj[i][j]<<" ";
        }
        cout<<endl;
    }
}