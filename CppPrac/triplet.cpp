#include<iostream>
using namespace std;
int triplet(int arr[],int a){
    int sum=0,cnt=0;
    for (int i = 0; i < a; i++)
    {
        sum=sum+arr[i];
        while (a--)
        {
            cout<<"sum "<<sum<<endl;
            cout<<" arr[i] "<<arr[i]<<endl;
            if (sum==arr[i]){
            cnt++;
            break;
            }
            i++;
        } 
       // cout<<"after break"<<endl;
    }
    return cnt;
}
int main(){
    cout<<"Enter array size "<<endl;
    int a;
    cin>>a;
    int arr[a];
    //int size=sizeof(arr)/sizeof(arr[0]);
    for (int i = 0; i < a; i++)
    {
        cin>>arr[i];
    }
    cout<<"No of triplet present in array"<<endl;
    cout<<triplet(arr,a)<<endl;
    return 0;
}