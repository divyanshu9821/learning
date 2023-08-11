#include <iostream>
#include <queue>
using namespace std;

// u = starting point of graph, V = no of vertices in graph
void dfs(bool **adj, int u, int V, bool *visited)
{
    // mark the current vertex as true means we have visisted
    visited[u] = true;
    // process the current vertex here we simply printing
    cout << u << " ";
    // for every connected vertex to the current vertex
    for (int v = 0; v < V; v++)
    {
        // if the connected vertex is not visisted then make a recursive call and pass that connected vertex
        if (visited[v] == false && adj[u][v] == true)
        {
            dfs(adj, v, V, visited);
        }
    }
}

void bfs(bool **adj, int u, int V)
{
    // declare a visited array that hold the true if vertex is visited and false if not visited
    bool visited[V] = {false};
    // declaring a queue
    queue<int> q;
    // enqueue the initial vertex
    q.push(u);
    // until queue is empty
    while (!q.empty())
    {
        // dequeue the vertex
        u = q.front();
        // marks that vertex visited means true
        visited[u] = true;
        // process the vertex
        cout << u << " ";
        // well dequeue is not in stl so here it removes the vertex from the queue
        q.pop();
        // for every connected vertex to the current vertex
        for (int v = 0; v < V; v++)
        {
            // if not visited already
            if (adj[u][v] == true && visited[v] == false)
            {
                // enqueue the vertex
                q.push(v);
                // marks that vertex visited means true
                visited[v] = true;
            }
        }
    }
}

int main()
{
    int v = 7;
    bool **adj;
    adj = new bool *[v];
    for (int i = 0; i < v; i++)
    {
        adj[i] = new bool[v];
    }

    for (int i = 0; i < v; i++)
    {
        for (int j = 0; j < v; j++)
        {
            adj[i][j] = false;
        }
    }

    adj[0][1] = true;
    adj[0][2] = true;
    adj[1][0] = true;
    adj[1][3] = true;
    adj[2][0] = true;
    adj[2][3] = true;
    adj[2][4] = true;
    adj[2][5] = true;
    adj[3][1] = true;
    adj[3][2] = true;
    adj[4][2] = true;
    adj[4][5] = true;
    adj[4][6] = true;
    adj[5][2] = true;
    adj[5][4] = true;
    adj[6][4] = true;

    // for(int i = 0;i<v;i++){
    //     for(int j = 0;j<v;j++){
    //         cout<<adj[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }

    bool *visited = new bool[v];
    for (int i = 0; i < v; i++)
    {
        visited[i] = false;
    }

    bfs(adj, 2, v);
    cout << endl;
    dfs(adj, 2, v, visited);
}