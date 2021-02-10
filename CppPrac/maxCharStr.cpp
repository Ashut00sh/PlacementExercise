#include<string>
#include<iostream>
using namespace std;
string getMaxChar(string s){
    int cnt[2]={0};
    // for (int i = 0; i < 2; i++)
    // {
    //     cout<<"value of cnt is ="<<cnt[i];
    // }
    int max=0;
    string result;
    for (int i = 0; i < s.length(); i++)
    {
        cnt[s[i]]++;
        if (max>cnt[s[i]])
        {
            max=cnt[s[i]];
            result=cnt[s[i]];
        }
        
    }
    return result;
}
int main(){
    string s;
    cout<<"Enter a string to get max repeating char in str"<<endl;
    cin>>s;
   // cout<<"last char position " <<s.length()<<endl;
   // cout<<"last char position -1 "<<s.length()-1<<endl;
    for (int i = 0; i < s.length(); i++)
    {
        cout<<s.at(i)<<" ";
    }
    cout<<endl;
    cout<<getMaxChar(s)<<endl;
    return 0;
}