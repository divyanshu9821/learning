#include <iostream>
#include <queue>
#include "graphStruct.cpp"
using namespace std;

void shortestPathUsingBFS(Graph *g, int s)
{
    int distance[g->v]; // distance of the ith vertex from s
    int path[g->v];     // previous vertex that gives the shortest distance

    path[s] = s;
    for (int i = 0; i < g->v; i++)
    {
        if (i == s)
        {
            distance[i] = 0;
        }
        else
        {
            distance[i] = -1;
        }
    }

    queue<int> q;
    q.push(s);
    while (!q.empty())
    {
        int u = q.front();
        q.pop();
        for (int i = 0; i < g->v; i++)
        {
            if (g->adj[u][i])
            {
                if (distance[i] == -1)
                {
                    q.push(i);
                    distance[i] = distance[u] + 1;
                    path[i] = u;
                }
            }
        }
    }

    for(int i = 0;i<g->v;i++){
        cout<<i<<" "<<distance[i]<<" "<<path[i]<<endl;
    }

    /* 
    2 0 5 
    
     */
}

int main()
{
    /*
        v = 7
        e = 10
        0 1
        0 3
        1 3
        1 4
        2 0
        2 5
        3 5
        3 6
        4 6
        6 5
    */
    Graph *g = createGraph();
    int s;
    cout<<"Enter starting vertex"<<endl;
    cin>>s; // starting point
    shortestPathUsingBFS(g,s);
}