#include<iostream>
#include<cstring>
using namespace std;
int main(){
    string s,rec="";
    cout<<"Enter a string "<<endl;
    getline(cin,s);
    for (int i = s.length()-1; i >= 0; i--)
    {
        rec=rec+s.at(i);
        // if (rec.equal(s))
        // {
        //     cout<<"given string is palindrom"<<endl;
        // }else
        // cout<<"given string is not palindrom"<<endl;
        
    }
    cout<<"reverse string is ="<<rec<<endl;
    return 0;
}