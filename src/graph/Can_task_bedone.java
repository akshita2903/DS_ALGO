package graph;
import java.util.*;
public class Can_task_bedone {
    public static void main() {
//course schedule in leetcode
        
    }
    public boolean canFinish(int numCourses, int[][] prereq) {
        //if there is a cycle answer==no,else yes (in Directed graph)
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int i=0;i<numCourses;i++)
                adj.add(new ArrayList<Integer>());
            for(int i=0;i<prereq.length;i++)
                adj.get(prereq[i][0]).add(prereq[i][1]);
            boolean[] vis=new boolean[numCourses+1];
            boolean[] par=new boolean[numCourses+1];
            for(int i=0;i<numCourses;i++){
                if(!vis[i] && isCycle(i,-1,adj,vis,par))
                    return false;
            }
            return true;
            
        }
        boolean isCycle(int src,int parent,ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] par){
            vis[src]=true;
            par[src]=true;
            for(int edge:adj.get(src)){
                if(!vis[edge])
                    if(isCycle(edge,src,adj,vis,par))
                    return true;
                if(par[edge])
                    return true;
            }
            par[src]=false;
            return false;
        }
}
