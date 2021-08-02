package graph;
import java.util.*;
class adjacency_list_representation{
    //Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        adjacent(V,adj,ans);
        return ans;
    }
    void adjacent(int v, ArrayList<ArrayList<Integer>> adj, ArrayList<ArrayList<Integer>> ans)
    {
        for(int i=0;i<v;i++){
        ArrayList<Integer> t=new ArrayList<>();
        t.add(i);
        for(int j=0;j<adj.get(i).size();j++)
        t.add(adj.get(i).get(j));
        ans.add(t);
         
        }
    }
}