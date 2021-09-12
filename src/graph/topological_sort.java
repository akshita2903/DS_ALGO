package graph;
import java.util.ArrayList;
import java.util.Stack;
/*Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge u v, vertex u comes before v in the ordering.*/
//---------------------------------------APPROACH------------------------//
/**1-USE FIND CONNECTED COMPONENT ALGORITHMS USING DFS
 
 * 2-USE A TEMP STACK 
 * 3- RECURSIVELY CALL T_s FOR ADJACENT VERTICES OF  CURRENT VERTEX THEN PUSH CURRENT VERTEX IN TO STACK AFTER ALL ADJACNET VERTICES OF CURRENT VERTEX IS IN THE STACK
*/
public class topological_sort {
        //Function to return list containing vertices in Topological order. 
        static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
        {
            // add your code here
            boolean[] vis=new boolean[V]; //to avoid repettion use vis array
            int[] ans=new int[V];
            int j=0;
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<V;i++)
            {
                if(!vis[i]) //for each vertex that is unvisited call for its topoloical sorrt(sim to connected component)
                topo_sort(i,adj,st,vis);
            }
            while(st.size()>0)
            ans[j++]=st.pop();
            return ans;
        }
        static void topo_sort(int src,ArrayList<ArrayList<Integer>> adj,Stack<Integer> st,boolean[] vis)
        {
           vis[src]=true;
//System.out.println("component"+src); => to get connected component
           for(int nbr:adj.get(src))
           {
               if(vis[nbr]==false) topo_sort(nbr,adj,st,vis);
           }
           //after all nbrs of src visitd and added to stack pus src to stack
           st.push(src);
        }
}
