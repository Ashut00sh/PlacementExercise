#include<iostream>
#include<cstring>
using namespace std;
#define MAX 10
class Stack1{
    private:
        int data;
        int top;
        int arr[MAX];
    public:
        Stack1(){
            this->data=0;
            this->top=-1;
            memset(arr,0,sizeof(arr));
        }
       void isEmpty(){
            if (top==-1)
            {
                cout<<"Stack underflow"<<endl;
                //exit(1);
              //  return 0;
            }
        }
       void isFull(){
            if (top==MAX-1)
            {
                cout<<"Stack Overflow"<<endl;
               // exit(1);
              // return 0;
            }    
        }
        void push(int data){
            isFull();
            top++;
            arr[top]=data;
        }
        int pop(){
            isEmpty();
            int temp=arr[top];
            top--;
            return temp;
        }
};
int main(){
        Stack1 obj;
        obj.push(10);
        obj.push(20);
        obj.pop();
    return 0;
}