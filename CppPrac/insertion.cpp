#include<iostream>
using namespace std;
void insertionSort(int arr[],int n){
    int v,j;
    for (int i = 1; i < n; i++)
    {
        v=arr[i];
        j=i;
        while (arr[j-1] > v && j >= 1)
        {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = v;
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
    int arr[]={21,54,87,78,45,12};
    int size=sizeof(arr)/sizeof(arr[0]);
    insertionSort(arr,size);
    cout<<" sorted array is== "<<endl;
    print(arr,size);
    return 0;
}