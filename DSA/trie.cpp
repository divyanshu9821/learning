#include<iostream>
using namespace std;

struct trieNode{
    trieNode *arr[26];
    bool eow;
};

trieNode* createNode(){
    trieNode *node = new trieNode();
    for(int i = 0;i<26;i++){
        node->arr[i] = NULL;
    }
    node->eow = false;
    return node;
}

struct trieNode *trieRoot = createNode();


void insertInTrie(string str){
    if(!trieRoot){
        trieRoot = createNode();
    }
    trieNode *root = trieRoot;
    for(int i = 0;i<str.length();i++){
        int ch = str[i]-'a';
        if(root->arr[ch]==NULL){
            root->arr[ch] = createNode();
        }
        root = root->arr[ch];
    }
    root->eow = true;
}

bool search(string str){
    bool isPresent = true;
    trieNode *root = trieRoot;
    for(int i = 0;i<str.length();i++){
        int ch = str[i]-'a';
        if(root->arr[ch]==NULL){
            isPresent = false;
            break;
        }
        root= root->arr[ch];
    }
    if(root->eow==false)
        isPresent = false;
    return isPresent;
}

int main(){
    string arr[] = {"apple","apply","low","lower","loop","app","adding"};
    int arrLen = sizeof(arr)/sizeof(arr[0]);
    for(int i = 0;i<arrLen;++i){
        // cout<<arr[i]<<endl;
        insertInTrie(arr[i]);
    }

    cout<<search("lower")<<endl;
}