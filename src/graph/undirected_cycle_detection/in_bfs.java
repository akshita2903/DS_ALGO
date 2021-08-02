package graph.undirected_cycle_detection;
import java.util.*;
class Node{
    int curr,par;
    public  Node(int x,int y)
    {
        this.curr=x;
        this.par=y;
    }
}

public class in_bfs {
    
 //Function to detect cycle in an undirected graph.
 public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj)
 {
   boolean vis[]=new boolean[V+1];
   for(int i=0;i<V;i++){
       if(!vis[i] && cycle(i,adj,-1,vis))
       return true;
   }
   return false;
 }
 public boolean cycle(int cur,ArrayList<ArrayList<Integer>> adj,int p,boolean vis[])
 {
   Queue<Node> q=new LinkedList<>();
   q.add(new Node(cur,-1)); //for node lets it parent=-1
   while(!q.isEmpty()){
       int data=q.peek().curr;
       int parent=q.peek().par;
       vis[data]=true;
       q.remove();
       for(int x:adj.get(data))
       {
           if(!vis[x])
           q.add(new Node(x,data));
           
           else if(x!=parent) return true; //check if x is not ==previous node(coz every prev node is  always visited)
      ////chk if for any next  curr data node that node is adjacnet of curr_node then there is  a cycle
        }
       
   }
   return false;
 }
}
