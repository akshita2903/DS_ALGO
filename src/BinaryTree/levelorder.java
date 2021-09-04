package BinaryTree;
import java.util.*;
class Node{
    Node root,left,right; int data;
}
public class levelorder{
    static ArrayList <Integer> levelOrder(Node node) 
    {
    Queue<Node> q=new LinkedList<>();
    ArrayList<Integer> l=new ArrayList<>();
    q.add(node);
    while(!q.isEmpty()){
     
        Node y=q.poll();
        if(y!=null) l.add(y.data);
        else l.add(null);
        if(y.left!=null) q.add(y.left);
        
        if(y.right!=null) q.add(y.right);
    }
    return l;
    }
} 