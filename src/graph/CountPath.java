package src.BinaryTree.graph;
import java.util.*;
class CountPath{
    int count=0;
    public int possible_paths(int[][] edges, int n, int s, int d)
    {
        // Code here
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<=n;i++) graph.add(new ArrayList<Integer>());
        for(int[] edge:edges)
            graph.get(edge[0]).add(edge[1]);
        boolean[] vis=new boolean[n+1];
        countpath(graph,s,d,vis);
        return count;
    }
    void countpath(ArrayList<ArrayList<Integer>> l,int s,int d,boolean[] vis)
    {
        if(s==d){
            count++;
            return ;
        }
        vis[s]=true;
        for(int i=0;i<l.get(s).size();i++)
        {
            int x=l.get(s).get(i);
            if(vis[x]==false){
                countpath(l,x,d,vis);
            }
        }
        vis[s]=false;
    }
}