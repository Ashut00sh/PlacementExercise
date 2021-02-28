#include<iostream>
using namespace std;
void insertionSort(int arr[],int a){
    for (int i = 0; i < a-1; i++)
    {
        int min=i;
        for (int j = i+1; j < a; j++)
        {
            if (arr[j]<arr[min])
            {
                min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        
    }
    
}
void print(int arr[],int n){
    for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main(){
    int arr[]={78,98,45,99,14,2};
    int size=sizeof(arr)/sizeof(arr[0]);
    insertionSort(arr,size);
    cout<<"sorted array is === "<<endl;
    print(arr,size);
    return 0;
}