///starting
package graph;
import java.util.*;
/**
 * Dijkstra
 */
class pair {
    int v,wt;
    pair(int v,int wt){
       this.v=v;
       this.wt=wt;
    }
    
}
public class Dijkstra {

   
    
        //Function to find the shortest distance of all the vertices
        //from the source vertex S.
        static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
        {
            int[] dist=new int[V];
            for(int i=0;i<V;i++) dist[i]=Integer.MAX_VALUE;
            dist[S]=0;
            PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.wt-b.wt);
            pq.add(new pair(S,0));
            while(pq.size()>0)
            {
                pair u=pq.poll();
                int v=u.v;
                for(ArrayList<Integer> l:adj.get(v))
                {
                    int nbr=l.get(0);
                    int wt=l.get(1);
                    if(dist[v]+wt<dist[nbr])
                    {
                        dist[nbr]=dist[v]+wt;
                        pq.add(new pair(nbr,dist[nbr]));
                    }
                }
            }
            return dist;
            
        }
    
    
    }
    
    
