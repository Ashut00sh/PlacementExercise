#include<iostream>
using namespace std;
int main(){
    string s,result="";
    getline(cin,s);
    int hash[123]={0};
    for (int i = 0; i < s.length(); i++)
    {
        if (hash[s[i]]==0||hash[s[i]]==32)
        {
            hash[s[i]]=1;
            result=result+s[i];
        }
          //  cout<<"hash table"<<hash[i]<<" ";
    }
    cout<<endl;

    cout<<"result ="<<result<<endl;
    return 0;
}