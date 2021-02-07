#include<bits/stdc++.h>
using namespace std;
const int MAX=100;
void printdia(int mat[][MAX],int n){
    cout<<"print diagonal matrix"<<endl;
    for (int i = 0; i < n-1; i++)
    {
        cout<<mat[i][i]<<",";
    }
     cout<<mat[n-1][n-1];
    cout<<endl;
}
void printsecdia(int mat[][MAX],int n){
    cout<<"print secondary diagonal"<<endl;
    int k=n-1;
    for(int i=0;i<n-1;i++){
        cout<<mat[i][k]<<",";
        k--;
    }
    cout<<mat[k][0]<<endl;
}
int main(){
    int mat[][MAX]={{1,2,3,4},
                    {5,6,7,8},
                    {1,2,3,4},
                    {5,6,7,8}};
    int size=sizeof(mat)/sizeof(mat[0]);
    cout<<"size of matrix is= "<<size<<endl;
    printdia(mat,size);
    printsecdia(mat,size);
    return 0;
}