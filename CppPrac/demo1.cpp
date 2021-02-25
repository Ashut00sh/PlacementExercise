#include<iostream>
using namespace std;
class length{
    private:
    int meter;
    public:
    length(): meter(){}
    friend int func(length);
};
int func(length d){
    int k;
    d.meter=6+87;
    k=d.meter*50;
    return k;
}
int main(){
    length k;
    
    cout<<"meters   "<<func(k)<<endl;
    cout<<"inches   "<<func(k)<<endl;
    return 0;
}