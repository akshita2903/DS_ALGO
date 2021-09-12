package graph;
import java.util.*;
class hamilton_path{
     boolean check(int N, int M, ArrayList<ArrayList<Integer>> g) 
    { 
        // code here
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<=N;i++)
        graph.add(new ArrayList<Integer>());
        for(int i=0;i<M;i++)
        {
            int u=g.get(i).get(0);
            int v=g.get(i).get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
boolean[] vis=new boolean[N+1];
for(int i=1;i<=N;i++)
{
    if(!vis[i] && findpath(graph,i,1,vis,N))
    return true;
    
}
return false;
    }
    boolean findpath(ArrayList<ArrayList<Integer>> g,int src,int c,boolean[] vis,int N)
    {
        if(c==N) return true;
        vis[src]=true;
        for(int nbr:g.get(src))
        {
            if(vis[nbr]==false)
           if( findpath(g,nbr,c+1,vis,N))
           return true;
        }
        vis[src]=false;
        return false;
    }

}