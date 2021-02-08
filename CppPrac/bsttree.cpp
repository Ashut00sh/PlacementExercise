#include<iostream>
using namespace std;
//node class
class Node{
    private:
    int data;
    Node *left,*right;
    public:
    Node(){
        data=0;
        left=right=nullptr;
    }
    Node(int data){
        this->data=data;
        left=right=nullptr;
    }
    int getData(){
        return data;
    }
    void setLeft(Node *left){
        this->left=left;
    }
    Node *getLeft(){
        return left;
    }
    void setRight(Node *right){
        this->right=right;
    }
    Node *getRight(){
        return right;
    }
};
class Bst{
    private:
    Node *root;
    Bst(){
        root=nullptr;
    }
};