#include<iostream>
using namespace std;
void calc(int x,int y){
    cout<<"x*y===  "<<x*y<<endl;
}
void calc(int &a,int &b){
    cout<<"a*b===  "<<a*b<<endl;
}

int main(){
    int m=10,n=20;
    calc(10,20);
    return 0;
}