#include<iostream>
using namespace std;
void reverse(int arr[],int n){
    int start=0,end=n-1;
        while (start<end)
        {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        } 
}
void print(int arr[],int n){
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    
}
int main(){
    int arr[]={1,2,3,4};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<"size of an array"<<n<<endl;
    cout<<"array before reverse"<<endl;
    print( arr,n);
    reverse(arr,n);
    cout<<"array after reverse"<<endl;
    print( arr,n);


    return 0;
}