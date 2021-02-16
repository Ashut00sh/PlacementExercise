#include<iostream>
#include<string>
using namespace std;
string alpha(int n,string str){
    string result="";
      // Conversion according to ASCII values
    for (int i = 0; i < n; i++) {
        if (str[i] >= 'a' && str[i] <= 'z')
            // Convert lowercase to uppercase
            str[i] = str[i] - 32;
        else if (str[i] >= 'A' && str[i] <= 'Z')
            // Convert uppercase to lowercase
            str[i] = str[i] + 32;
    }
    for (int i = 0; i < n; i++)
    {
        result=result+str[i];
    }
    return result;
}
int main(){
    int n;
    cout<<"Enter lenght of str"<<endl;
    cin>>n;
    string s;
    cout<<"Enter str"<<endl;
    cin>>s;
    cout<<alpha(n,s);
    return 0;
}