package BinaryTree;
import java.util.*;
class Node{
    Node right,left,root; int data;
}
public class leftview {
    ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer> l=new ArrayList<>();
        int a[]=new int[100];
return lv(root,l,0,a); //using peorder
//return LV(root,l) //using levl_order
     
}
//Using Pre_Order
ArrayList<Integer> lv(Node root,ArrayList<Integer> l,int h,int a[]){
    if(root==null) return l;
    if(a[h]==0){
        a[h]=1;
        l.add(root.data);
    }
    if(root.left!=null)
     lv(root.left,l,h+1,a);
     if(root.right!=null)
     lv(root.right,l,h+1,a);
     return l;
    
} //space->O(n) and time exponent
//--------------------------------------------------------------------------//
//using LEVEL_ORDER
ArrayList<Integer> LV(Node r,ArrayList<Integer> l){
    if(r==null) return l;
    Queue<Node> q=new LinkedList<>();
    q.add(r);
    while(!q.isEmpty()){
        int n=q.size();
        for(int i=1;i<=n;i++){
            Node y=q.poll();
            if(i==1 && y!=null) l.add(y.data);
            if(y.left!=null) q.add(y.left);
            if(y.right!=null) q.add(y.right);
        }
    }

return l;
} //t.c->O(n) and space O(n)
}
