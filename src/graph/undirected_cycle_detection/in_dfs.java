package graph.undirected_cycle_detection;
import java.util.*;
class in_dfs{
    //Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
    {
    boolean vis[]=new boolean[V+1];
    for(int v=0;v<V;v++)
{
    if(!vis[v] && cycle(v,-1,adj,vis)) //for every node parent is -1 if that node is invisited(we dont know what will be the parent of that node thats y p=-1)
    return true;
}
return false;
    }
    //cuur_node,prev_node
    boolean cycle(int v,int p,ArrayList<ArrayList<Integer>> adj,boolean vis[])
    {
       
      vis[v]=true;
        for(int i:adj.get(v))
        {
           if(!vis[i]) //chk for next_node of p
           {
               if( cycle(i,v,adj,vis)) return true;
           }
           else if( i!=p) return true;
        }
        return false;
    }
}