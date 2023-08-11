#include <iostream>
#include <queue>
using namespace std;

void topologicalSort(int v, bool **adj, int *incident)
{
    queue<int> q;
    for (int i = 0; i < v; i++)
    {
        if (incident[i] == 0)
            q.push(i);
    }

    while (!q.empty())
    {
        int u = q.front();
        q.pop();
        cout << u << " ";
        for (int i = 0; i < v; i++)
        {
            if (adj[u][i])
            {
                if (--incident[i] == 0)
                    q.push(i);
            }
        }
    }
    cout << endl;
}

int main()
{
    int v; // vertices
    int e; // edges
    bool **adj;
    int *incident;
    cout << "No of Vertices? ";
    cin >> v;
    cout << "No of edges? ";
    cin >> e;
    // creating adjacency matrix
    adj = new bool *[v];
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

    incident = new int[v];

    // intializing the incident array by 0
    for (int i = 0; i < v; i++)
    {
        incident[i] = 0;
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
        incident[b]++;
        adj[a][b] = true;
    }

    // for (int i = 0; i < v; i++)
    // {
    //     for (int j = 0; j < v; j++)
    //     {
    //         cout<<adj[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }

    // for (int i = 0; i < v; i++)
    // {
    //     cout<<incident[i]<<" ";
    // }

    topologicalSort(v, adj, incident);
    return 0;
}