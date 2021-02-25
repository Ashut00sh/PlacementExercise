#include<iostream>
#include<vector>
using namespace std;
int main(){
    vector<int>v;
    int x;
    cout<<"Enter elements into vector"<<endl;
    for (int i = 0; i < 5; i++)
    {
        cin>>x;
        v.push_back(x);
    }
    vector<int>::iterator itr;
    // for (int i = 0; i < v.size(); i++)
    // {
    //     cout<<x;
    // }
    for (itr=v.begin();itr!=v.end();itr++)
    {
        cout<<*itr<<" ";
    }
    cout<<endl;
    //Sort(v.begin(),v.end());
    return 0;
}