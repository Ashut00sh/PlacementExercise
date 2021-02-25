#include<iostream>
using namespace std;
class a{
    protected:
     int  a;
     public:
     int b;
};
class b:private a{

};
class c:public b
{
    public:
    void display(){
        cout<<"aa  "<<a;
        cout<<"abb  "<<b;
    }
}
int main(){
    int m=10,n=20;
    calc(10,20);
    return 0;
}