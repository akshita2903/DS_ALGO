package BinaryTree;
import java.util.*;
public class leaf_at_Same_level
{
    boolean check(Node root)
    {
        return checked(root);
    }
    boolean checked(Node r){
        if(isLeaf(r)) return true;
        Queue<Node> q=new LinkedList<>();
        int level=0,cl=-2;
        q.add(r);
        while(!q.isEmpty()){
            
            int n=q.size();
            level++;
            while(n-->0){
                Node y=q.remove();
                Node l=y.left,rt=y.right;
                    if(l!=null) {
                        q.add(l);
                        if(isLeaf(l))
                        {
                            if(cl==-2) cl=level;
                            else if(cl!=level) return false;
                        }
                    }
                  
                    if(rt!=null){ q.add(y.right);
                     
                    if(isLeaf(rt))
                    {
                        if(cl==-2) cl=level;
                        else if(cl!=level) return false;
                    }
}
                
            }
            
        }
        return true;
        
    }
    boolean isLeaf(Node r){
        
        if(r.left==null && r.right==null) return true;
        return false;
    }
}
//time-coplexity->O(n)e
