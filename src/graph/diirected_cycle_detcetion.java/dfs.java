import java.util.*;
public class dfs {
     //Function to detect cycle in a directed graph.
     public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj)
     {
     boolean vis[]=new boolean[V+1];
 boolean in_same_dfs[]=new boolean[V+1];
    for(int i=0;i<V;i++){
        if(!vis[i] && check(i,vis,in_same_dfs,adj))
        return true;
    }
    return false;
     
     }
 
     boolean check(int node,boolean vis[],boolean in_s_dfs[],ArrayList<ArrayList<Integer>> adj)
     {
       vis[node]=true;
       in_s_dfs[node]=true;
       for(int i:adj.get(node))
       {
           if(!vis[i])
           {
               if(check(i,vis,in_s_dfs,adj)) return true;
           }
           else if(in_s_dfs[i]) return true;
       }
       in_s_dfs[node]=false;
       return false;
         
         
     }
    
}
