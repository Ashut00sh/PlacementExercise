#include<iostream>
using namespace std;
const int size=1;
int main(){
    int *arr,i=0;
    arr=new int[size];
    int cnt=0;
    cout<<"Enter array elements"<<endl;
    while (1)
    {
        cin>>arr[i];
        if (arr[i]==-1)
        {
            break;
        }
        i++;
        cnt++;
    }
    int size=sizeof(arr)/sizeof(arr[0]);
    cout<<"size of array = "<<size<<endl;
    for (int i = 0; i < cnt; i++)
    {
        cout<<arr[i]<<" "<<&arr[i]<<"\t";
    }
    cout<<endl;
    
    return 0;
}