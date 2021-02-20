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
    Node *root, *prev, *next;
    public:
    Bst(){
        root=prev=next=nullptr;
    }
    void insert(int data){
        Node *node=new Node(data);
        if (root==nullptr)
        {
            root=node;
        }else{
           Node *temp=root;
           while (temp!=nullptr)
           {
               prev=temp;
               if (temp->getData()<=data)
               {
                   temp=temp->getLeft();
               }else{
                   temp=temp->getRight();
               }
           }
           if(prev->getData()<=data){
               prev->setLeft(node);
               prev=nullptr;
           }else{
               prev->setRight(node);
               node=nullptr;
           }
        }
        
    }
    void display(){
        cout<<"preorder element"<<endl;
        preOrder(root);
        cout<<"postorder element"<<endl;
        PostOrder(root);
        cout<<"inorder element"<<endl;
        InOrder(root);
    }
    void preOrder(Node *temp){
        if (temp==nullptr)
        {
            return;
        }
        cout<<temp->getData()<<" ";
        preOrder(temp->getLeft());
        preOrder(temp->getRight());
        
    }
    
        void InOrder(Node *temp)
    {
        if(temp == NULL)
            return;

        InOrder(temp->getLeft());
        cout<<temp->getData()<<" ";
        InOrder(temp->getRight());
    }

    void PostOrder(Node *temp)
    {
        if(temp == NULL)
            return;

        PostOrder(temp->getLeft());
        PostOrder(temp->getRight());
        cout<<temp->getData()<<" ";
    }
};
int main(){
    Bst t;
    int m,n;
    cout<<"no of element to insert"<<endl;
    cin>>n;
    while (n>0)
    {
        cin>>m;
        t.insert(m);
        n--;
    }
    t.display();
    return 0;
}