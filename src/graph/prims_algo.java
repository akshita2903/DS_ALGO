package graph;
import java.util.*;
/** visited node,nbr-node with-min-weight,weight b/w them */
class tuple{
    int wt,v,n_v;
    tuple(int vertex,int neighbour_vertex,int weight){
        this.v=vertex;
        this.wt=weight;
this.n_v=neighbour_vertex;
    }
   
   
}

public class prims_algo {
    
   
      static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
        {
            // Add your code here
           
            boolean[] vis=new boolean[V];
            
          int min_weight=0;
            PriorityQueue<tuple> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
            pq.add(new tuple(0,-1,0));
            while(pq.size()>0)
            {
                tuple node=pq.poll();
                int weight=node.wt;
                int vertex=node.v;
                int nbr_v=node.n_v;
                if(vis[vertex]==true) continue;
              vis[vertex]=true;
              min_weight+=weight;
                
                for(ArrayList<Integer> nbr:adj.get(vertex))
                {
                int neighbour_edge=nbr.get(0);
                int weight_ne=nbr.get(1);
                if(vis[neighbour_edge]==false)
                pq.add(new tuple(neighbour_edge,vertex,weight_ne));
                }
            }
            return min_weight;
        }
    }

