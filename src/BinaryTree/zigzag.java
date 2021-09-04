package BinaryTree;
import java.util.*;
public class zigzag {
    ArrayList<Integer> zigZagTraversal(Node root)
	{
	   ArrayList<Integer> l=new ArrayList<>();
	   if(root==null) return l;
	   Stack<Node> st=new Stack<>();
	   Stack<Node> s=new Stack<>();
	   st.push(root);
	   int i=0;
	   while(!st.isEmpty())
	   {
	        Node y=st.pop();
	       
	       l.add(y.data);
	       if(i==0){
	          
	     
	       if(y.left!=null) s.push(y.left);
	         if(y.right!=null) s.push(y.right);
	   
	       }
	       else{
	       
	         if(y.right!=null) s.push(y.right);
	         if(y.left!=null) s.push(y.left);
	           
	       }
	       if(st.isEmpty()){
	           i=(i==1)?0:1;
	           Stack<Node> temp=new Stack<>();
	           temp=s;
	           s=st;
	           st=temp;
	       }
	   
	   }
	   return l;
	   
	}
}
