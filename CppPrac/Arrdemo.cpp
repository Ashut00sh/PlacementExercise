#include<iostream>
using namespace std;

int main()
{
  //write your code here
  int a,b,r=0;
  cin>>a;
  cout<<"vlaue if a  "<<a<<endl;
  while(a--){
    cin>>b;
    cout<<"value of b  "<<b<<endl;
    int arr[b];
    r=0;
    for(int i=0;i<b;i++){
      cin>>arr[i];
    }
    for(int j=0;j<b;j++){
        cout<<"val j: "<<j<<endl;
      int pos1=j+1;
      int pos2=j+3;
      cout<<"pos1= "<<pos1<<endl;
      cout<<"pos2= "<<pos2<<endl;
      // int temp=arr[j];
      // arr[j+2]=arr[j];
      // arr[j]=temp;
      cout<<"value arr[j]= "<<arr[j]<<endl;
      cout<<"value of abs= "<<abs(pos1-pos2)<<endl;
      r=r+(arr[j]*abs(pos1-pos2));
      cout<<"value of r "<<r<<endl;
    }
    cout<<r<<endl;
  }
  
  return 0;
}