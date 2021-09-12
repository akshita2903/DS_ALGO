package graph;
import java.util.*;
public class BFS {
     //Function to return Breadth First Traversal of given graph.
     public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
     {
         ArrayList<Integer> ans=new ArrayList<>();
         BFS(V,adj,ans);
         return ans;
     }
     void BFS(int vertex,ArrayList<ArrayList<Integer>> a,ArrayList<Integer> ans)
    {
        boolean vis[]=new boolean[vertex+1];
        Queue<Integer> q=new LinkedList<>();
        q.add(0); //since start from 0
        while(!q.isEmpty())
        {
            int x=q.poll();
            ans.add(x);
            for(int i:a.get(x)) {
                if(!vis[i])
                {
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        
    }
    
}
//time->O(V+E) and space>O(V+E)
