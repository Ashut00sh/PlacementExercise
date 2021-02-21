#include<iostream>
using namespace std;
int main(){
    int arr[3]={1,2,3};
    int arr1[3]={2,1,4};
    int sum=0,cnt=0;
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            sum=arr[i]+arr[j];
            for(int k=0;k<3;k++){
                if (sum==arr[k])
                {
                    cnt++;
                }
            }
        }
    }
    cout<<"total count = "<<cnt<<endl;
    return 0;
}