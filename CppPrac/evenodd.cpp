#include<iostream>
using namespace std;
bool isEven(int n){
    bool flag=true;
    for (int i = 1; i <= n; i++)
        flag=!flag;
        //flag;
        //cout<<"boolean flag==== "<<flag<<endl;
        //!flag;
        cout<<"boolean flag====not equal "<<flag<<endl;
        return flag;    
}
int main(){
    cout<<"Enter a number"<<endl;
    int a;
    cin>>a;
    isEven(a)?cout<<"Even":cout<<"odd";

    return 0;
}