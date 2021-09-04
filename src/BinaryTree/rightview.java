package BinaryTree;
import java.util.*;
class Node{
    Node right,left,root; int data;
}
public class rightview {
    ArrayList<Integer> rightView(Node node) {
        ArrayList<Integer> l=new ArrayList<>();
        int a[]=new int[100000];
    return rv(node,l,0,a);
    //return RV(node,l); using level_order
    }
    ArrayList<Integer> rv(Node r,ArrayList<Integer> l,int h,int a[]){
        if(r==null) return l;
        if(a[h]==0){
            l.add(r.data);
            a[h]=1;
        }
     if(r.right!=null)   rv(r.right,l,h+1,a);
    if(r.left!=null)    rv(r.left,l,h+1,a);
        return l;
    }
    ArrayList<Integer> RV(Node r,ArrayList<Integer> l){
        if(r==null) return l;
        Queue<Node> q=new LinkedList<>();
        q.add(r);
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=1;i<=n;i++){
                Node y=q.poll();
                if(i==1) l.add(y.data);
                if(y.right!=null) q.add(y.right);
                if(y.left!=null) q.add(y.left);
            }
        }
        
        return l;
    }
}


