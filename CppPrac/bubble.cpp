#include<iostream>
using namespace std;
void bubbleSort1(int arr[],int n){
    for (int i = n-1; i >=0; i--)
    {
        for (int j = 0; j < i; j++)
        {
            if (arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }   
        }   
    }
}
void print(int a[],int n){
    for (int i = 0; i < n; i++)
    {
        cout<<a[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int arr[]={78,98,45,65,12,32,10,20,30};
    int size=sizeof(arr)/sizeof(arr[0]);
    cout<<"size of array = "<<size<<endl;
    bubbleSort1(arr,size);
    cout<<"sorted array are--- "<<endl;
    print(arr,size);
    return 0;
}