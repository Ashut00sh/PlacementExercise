#include<iostream>
using namespace std;

int main(){
    int x=45,y=15,m,n;
    m=x;
    n=y;
    while (m!=n)
    {
        if(m>n)
        m=m-n;
    }
    
    cout<<"mm== "<<m<<endl;
    return 0;
}