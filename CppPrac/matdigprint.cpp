#include<bits/stdc++.h>
#include<iostream>
using namespace std;
   const int c=0,d=0;

void printdia(int a,int b,int size,int mat[c][d]){
    cout<<"value of a="<<a<<"value of b"<<b<<endl;
    for(int i=0;i<size;i++){
        cout<<mat[i][i];
    }
}
int main(){
    int a,b;
    cout<<"Enter no of rows"<<endl;
    cin>>a;
    cout<<"Enter no of columns"<<endl;
    cin>>b;
    int mat[a][b];
    cout<<"Enter "<<a<<"rows and "<<b<<" columns in array"<<endl;
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            cin>>mat[i][j];
        }
    }
    //to print the array
        for(int i=0;i<a;i++){
            cout<<"[";
        for(int j=0;j<b;j++){
            cout<<mat[i][j]<<",";
        }
        cout<<"]"<<endl;
    }
    int size=sizeof(mat)/sizeof(mat[0][0]);
    cout<<"array size = "<<size<<endl;
    printdia(a,b,size,mat);
    return 0;
}