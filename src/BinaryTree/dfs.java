package BinaryTree;
import java.util.*;
class Node{
    Node root,left,right; int data;
}
public class dfs {
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
      
    Queue<Node> q=new LinkedList<>();
    ArrayList<Integer> l=new ArrayList<>();
    Stack<Integer> st=new Stack<Integer>();
    q.add(node);
    while(!q.isEmpty()){
     
        Node y=q.poll();
        if(y!=null) st.push(y.data);
        
      
        
        if(y.right!=null) q.add(y.right);
          if(y.left!=null) q.add(y.left);
    
    }
    while(!st.isEmpty()) l.add(st.pop());
    return l;
    
        
    }
}
