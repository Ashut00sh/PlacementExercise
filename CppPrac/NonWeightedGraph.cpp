#include<iostream>
#include<cstring>
using namespace std;
#define MAX 10
class NonWeightedGraph{
    private:
        int vertex,edge;
        int mat[MAX][MAX];
    public:
    NonWeightedGraph(int vertex){
        this->vertex=vertex;
        this->edge=0;
        //initialise the all matrix elements with 0
        memset(mat,0,sizeof(mat));
    }
    void accept(){
        cout<<"Enter no of edges: ";
        cin>>edge;
        for (int i = 0; i < edge; i++)
        {
            cout<<"Enter edges from and to"<<endl;
            int from,to;
            cin>>from>>to;
            mat[from][to]=1;
            mat[to][from]=1;//comment this if it is directed graph
        }
        
    }
    void show(){
        for (int i = 0;i < vertex;i++)
        {
            for (int j = 0; j < vertex; j++)
            {
                cout<<mat[i][j]<<"\t";    /* code */
            }
            cout<<endl;
        }
        
    }
};
int main(){
    int vertex;
    cout<<"Enter no of vertex "<<endl;
    cin>>vertex;
    NonWeightedGraph g(vertex);
    g.accept();
    cout<<"Non Weighted Graph adjacency matrix is: "<<endl;
    g.show();
    return 0;
}
/*
6
7
01 02  03 12,14,34,35
*/