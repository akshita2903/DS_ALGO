package graph;
/*
Purpose->Use to detect negative weight cycle 
2-calculate minimum weight for edges if some edge has negative weight.Djikstra algo does not work appropriate in neagtive weigt edge
Algorithm: initialise a dist[] array with Integer.MAX_VALUE or infinite
set->dist[src]=0;
// =>This guarantee that the minimum weight for vertex which is ith distance fom source will be get in <=ith step
--ALgo for minimum weight ---
 Traverse from 1 to total vertex (outer loop)
    //  Traverse from 0 to vertex-1 or size of matrix
     check if dist[u]+weight<dist[v]
     Update:dist[v]=dist[u]+weight
     --Detect Negative Cycle---
     after filing min weight for each vertex again run two loops and chk if
     d[u]+weight<d[v] means there is a cycle,To check this proof dry run on nbk :)
*/

public class Bellman_Ford {
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
       int[] dist=new int[n];
       
       
       fill_max(dist,n);
       dist[0]=0;
       for(int i=1;i<n;i++){
           for(int j=0;j<edges.length;j++){
               int u=edges[j][0];
               int v=edges[j][1];
               int weight=edges[j][2];
               if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v])
               dist[v]=dist[u]+weight;
           }
       }
       for(int i=1;i<n;i++){
           for(int j=0;j<edges.length;j++){
               int u=edges[j][0];
               int v=edges[j][1];
               int weight=edges[j][2];
               if(dist[u]!=Integer.MAX_VALUE && dist[u]+weight<dist[v])
             return 1;
             
           }
       }
       return 0;
       
    }
    public void fill_max(int[] dist,int v){
        for(int i=0;i<v;i++)
        dist[i]=Integer.MAX_VALUE;
    }
}
