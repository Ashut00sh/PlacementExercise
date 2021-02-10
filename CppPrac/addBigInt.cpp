#include<iostream>
#include<string>
using namespace std;

void sumbigint(string a,string b){
    //find max length among two numbers
    int min=a.length()>b.length()?b.length():a.length();
    int max=a.length()>b.length()?a.length():b.length();
    int num1[max];
    int num2[max];
    for (int i=0; i <= a.length()-1; i++)
    {
        num1[i]=static_cast<int>(a.at(i)-'0');
        cout<<num1[i];
    }
    cout<<endl;
        for (int i=0; i <= a.length()-1; i++)
    {
        num2[i]=static_cast<int>(b.at(i)-'0');
        cout<<num2[i];
    }
    cout<<endl;
    int carry=0;
    int sum[max+1];
    for (int i = 0; i < max; i++)
    {
        cout<<"num1= "<<num1[i]<<endl;
        cout<<"num2= "<<num2[i]<<endl;
        cout<<"carry= "<<carry<<endl;
        cout<<"result= "<<((num1[i]+num2[i]+carry)%10)<<endl;
        sum[i]=(num1[i]+num2[i]+carry)%10;
        if ((num1[i]+num2[i]+carry)>=10)
            carry=((num1[i]+num2[i])/10);
            else
            carry=0;
        sum[max]=carry;
    }
    for (int i = max;i>0; i--)
    {
        cout<<sum[i];
    }
    
}
int main(){
    string a,b;
   // int sum,c,d;
    cout<<"Enter Two numbers "<<endl;
    cin>>a>>b;
    sumbigint(a,b);
    return 0;
}