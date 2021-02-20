#include<iostream>
using namespace std;
class Node{
    int data;
    Node *next;
    public:
    Node(){
        next=nullptr;
        data=0;
    }
    ~Node(){
        next=nullptr;
    }
    Node(int data){
        this->data=data;
        this->next=nullptr;
    }
    int getData(){
        return data;
    }
    Node* getNext(){
        return next;
    }
    void setNext(Node *next){
        this->next=next;
    }
};
class LinkList{
    Node *head;
    public:
    LinkList(){
        head=nullptr;
    }
    void insert(int data){
        Node *n=new Node(data), *temp=nullptr;
       // cout<<"kuth1"<<endl;
        if (head==nullptr)
        {
            head=n;
           // cout<<"kuth2"<<endl;
        }else{
            temp = head;
           // cout<<"kuth3"<<endl;
            while (temp->getNext() != nullptr)
            {
               // cout<<"kuth4"<<endl;
                temp = temp->getNext();
            }
              //  cout<<"kuth5"<<endl;
                temp->setNext(n);
              //  cout<<"kuth6"<<endl;
                n->setNext(nullptr);
              //  cout<<"ka re ha durava"<<endl;
            
        }
    }
    void display(){
        Node *temp=head;
        while (temp!=nullptr)
        {
            cout<<"n-- "<<temp->getData()<<" ";
            temp=temp->getNext();
            cout<<"-n-";
        }
        cout<<endl;
    }
};
int main(){
    LinkList ls;
    cout<<"Enter number of list"<<endl;
    int n,m;
    cin>>n;
    cout<<" inset data\t"<<endl;
    for (int i = 0; i < n; i++)
    {
        cin>>m;
        ls.insert(m);
       // cout<<" "<<i<<endl;
    }
    cout<<"display the list"<<endl;
    ls.display();
    return 0;
}