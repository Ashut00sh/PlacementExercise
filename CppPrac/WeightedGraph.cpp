#include<iostream>
#include<cstring>
using namespace std;
#define MAX 10
#define M 999
class WeightedGraph{
    private:
        int mat[MAX][MAX];
        int vertex,edge,weight;
    public:
        WeightedGraph(int vertex){
            this->vertex=vertex;
            this->edge=0;
            this->weight=0;
            memset(mat,INT_MAX,sizeof(mat));
        }
        void accept(){
            cout<<"Enter no of edges"<<endl;
            cin>>edge;
            for (int i = 0; i < edge; i++)
            {
                cout<<"Enter Edge from to to and weight"<<endl;
                int from,to;
                cin>>from>>to>>weight;
                mat[from][to]=weight;
                mat[to][from]=weight;
            }
            
        }
        void show(){
            for (int i = 0; i < vertex; i++)
            {
                for (int j = 0; j < vertex; j++)
                {
                    cout<<mat[i][j]<<"\t";
                }
                cout<<endl;
            }
            
        }
};
int main(){
    int vertex;
    cout<<"Enter Vertex"<<endl;
    cin>>vertex;
    WeightedGraph g(vertex);
    g.accept();
    cout<<"Weght graph adjecancy matrix is"<<endl;
    g.show();
  
    return 0;
}
/*
6
7
0 1  7
0 2 4
0 3 8
1 2 9
1 4 5
3 4 6
3 5 2
*/