#include<iostream>
using namespace std;
class Solution{
public:	
	
	int countTriplet(int arr[], int n)
	{
	    int cnt=0,sum=0,f,l;
	    f=arr[0];
	    l=arr[n-1];
        cout<<"first element is="<<f<<endl;
        cout<<"last element is="<<l<<endl;
	    for(int i=0;i<n;i++){
	        sum=sum+arr[i];
	        if(sum==arr[i])
	        cnt++;
	    }
	    return cnt;
	}
};

int main() 
{
   	
   	ios_base::sync_with_stdio(0);
    cin.tie(NULL);
    cout.tie(NULL);
   
   	int t;
       cout<<"enter no ofelements to insert into array"<<endl;
    cin>>t;
    while (t--)
    {
        int n;
        cin >> n;

        int arr[n];
        cout<<"insert array elements"<<t<<"no"<<endl;
        for(int i = 0; i < n; i++)
        	cin >> arr[i];

        Solution ob;
        cout << ob.countTriplet(arr, n) << "\n";

    }

    return 0;
}