#include<iostream>
#include<cmath>
using namespace std;
int find(int k,int n){
    cout<<"squart= "<<sqrt(n)<<endl;
    int x=ceil(sqrt(n));
    cout<<"cei values= "<<ceil(sqrt(n));
    cout<<"result= "<<k*(x-1)+1<<endl;
    return k*(x-1)+1;
}
int main(){
    int n,k;
    cout<<"Enter two values"<<endl;
    cin>>n>>k;
    find(k,n);
    cout<<find(k,n)<<endl;
    return 0;
}