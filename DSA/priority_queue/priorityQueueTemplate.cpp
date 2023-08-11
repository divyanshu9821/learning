#include<iostream>
using namespace std;

template<class t>
class myPair{
    public:
    int prior;
    t data;    
};

template<class t>
class myPriorityQueue{
    public:
    int size;
    int capacity;
    myPair<t> *maxHeap;

    myPriorityQueue(){
        size = 0;
        capacity = 1;
        maxHeap = new myPair<t>[capacity];
    }

    void resize(){
        capacity*=2;
        myPair<t>* newHeap = new myPair<t>[capacity];
        for(int i = 0;i<size-1;i++){
            newHeap[i].data = maxHeap[i].data;
            newHeap[i].prior = maxHeap[i].prior;
        }
        delete[] maxHeap;
        maxHeap = newHeap;
    }

    void insert(t ele, int prio){
        size++;
        if(size>capacity){
            resize();
        }
        maxHeap[size-1].data = ele;
        maxHeap[size-1].prior = prio;
    }

    void display(int index){
        cout<<maxHeap[index].data<<" ";
        cout<<maxHeap[index].prior<<endl;
    }
    
};


int main(){

    myPriorityQueue<string> pq;
    pq.insert("check",10);
    pq.insert("chec",11);
    pq.insert("che",12);
    pq.insert("ch",13);

    for(int i =0;i<pq.size;i++){
        pq.display(i);
    }
    pair<int, int> a;

}