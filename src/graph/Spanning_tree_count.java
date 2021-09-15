package graph;
import java.util.ArrayList;

/*
ALGORITHM
1-FILL ADJACNECY MATRIX FOR GRAPH
2-EXCEPT DIAGONALS AND ROWS-COLUMN HAVING VALUE==0,FILL ALL OTHER ROWS AND COLUNS WITH -1
3-iN DIAGONAL FILL WITHTHIER DEGRESS
4-FIND COFACTO OF ANY ROW-COLUMN THA IS THE ANSWER
DIRECT FORAMULA=(N^(n-2))
*/ 
class Spanning_tree_count{
  



    static ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    static int[][] adj_m;
   static class graph{
        int vertex,edges;

       graph(int v,int e){
            vertex=v;
            edges=e;
        adj_m=new int[v+5][v+5];
            for(int i=0;i<=vertex;i++)
                adj.add(new ArrayList<>());
        }
     static   void  addEdge(int vertex,int nbr){ //adjacency list
            adj.get(vertex).add(nbr);
         adj.get(nbr).add(vertex);
//         System.out.println("before"+adj_m[vertex][nbr]);
         adj_m[vertex][nbr]=1;
         adj_m[vertex][vertex]=1;
         adj_m[nbr][nbr]=1;
         adj_m[nbr][vertex]=1;
//         System.out.println("after"+adj_m[vertex][nbr]);

        }
       //Graph coloring concept


}





   static void printgraph(){
        for(int i=1;i<adj.size();i++)
        { System.out.print(i+" ");
            for(int j:adj.get(i))
            System.out.print("->"+j);
            System.out.println();
        }
//        for(int i=1;i<adj.size();i++)
//            System.out.println(adj_m[i][i]);
    }
    static void fill_adj_matr(){
       for(int i=1;i<adj.size();i++){
           for (int j=1;j<adj.size();j++)
           {
               if(adj_m[i][j]==0){}
               else adj_m[i][j]=-1;
           }
       }
       for(int i=1;i<adj.size();i++)
           adj_m[i][i]=adj.get(i).size();
    }
    static void print_color_matrix(){
        System.out.println("Adjacency matrix to find sanning tree in graph ");
        for(int i=1;i<adj.size();i++){
            for(int j=1;j< adj.size();j++)
            {
                System.out.print(adj_m[i][j]+" ");
            }
            System.out.println();
        }
    }








    public static void main(String[] args) {
        graph g=new graph(4,4);
      g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,2);
        g.addEdge(4,1);
        //fill_adjacency_matrix();
        printgraph();
        fill_adj_matr();
        print_color_matrix();
    }
}



