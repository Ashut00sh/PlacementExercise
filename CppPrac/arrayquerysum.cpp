#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int>arr(n,0);//initializion
    int q;
    cin>>q;
    while (q--)
    {
        int l,r;
        cin>>l>>r;
        arr[l]++;
        if (r+1<n)
        {
            arr[r+1]--;
        }
        
    }
    //cumulative sum
    for (int i = 1; i < n; i++)
    {
        arr[i]+=arr[i-1];
    }
       for (int i = 0; i < n; i++)
    {
        cout<<arr[i]<<" ";
    }
    return 0;
}