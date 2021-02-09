#include<iostream>
using namespace std;
int main(){
    string s1="hello ASHUTOSH camelCase";
    for (int i = 0; i < s1.length(); i++)
    {
        if (s1.at(i)>=97&&s1.at(i)<=123)
        {
            s1.at(i)=s1.at(i)-32;
        }
        else if (s1.at(i)>=65&&s1.at(i)<=96)
        {
           s1.at(i)=s1.at(i)+32;
        }
        
        
    }
    cout<<s1<<endl;
    return 0;
}