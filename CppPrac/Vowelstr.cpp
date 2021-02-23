#include<iostream>
using namespace std;
int main(){
    string str="i play cricket";
    for (int i = 0; i < str.length(); i++)
    {
        if (str.at(i)=='a'||str.at(i)=='e'||str.at(i)=='i'||str.at(i)=='o'||str.at(i)=='u')
        {
            cout<<"vowels present in string are= "<<str.at(i)<<endl;
        }
        
    }
    cout<<str<<endl;
}