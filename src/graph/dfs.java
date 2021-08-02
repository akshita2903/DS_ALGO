package graph;
import java.util.*;
public class dfs {
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean vis[]=new boolean[V+1];
        ArrayList<Integer> ans=new ArrayList<>();
        DFS(0,adj,ans,vis);
        return ans;
    }
    void DFS(int v,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,boolean vis[])
    {
        if(!vis[v]){ //v is curr node
            vis[v]=true;
            ans.add(v);
        }
        for(int i:adj.get(v))
        {
            if(!vis[i])
            {
                DFS(i,adj,ans,vis); //call dfs for adjacnt of node v
            }
        }
    }
}
