package BinaryTree.src.BinaryTree;
import java.util.*;
public class mirror {
    mirror left,right;

    int val;

}
class Soltion{
public boolean isSymmetric(mirror root) {
   //  return m(root,root);
   return m(root);

    }
  /*  public boolean m(mirror root,mirror root1)
    {
        if(root==null && root1==null) return true;
        else if(root==null || root1==null) return false;
        return (root.val==root1.val ) && m(root.left,root1.right)
            && m(root.right,root1.left)
           ;
    } recursion*/
    //iterative Approach
    public boolean m(mirror root)
    {
        Queue <mirror> q=new LinkedList<mirror>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty())
        {
            mirror t1=q.poll();
            mirror t2=q.poll();
            if(t1==null && t2==null) {
            continue;
            }
            else if(t1==null || t2==null) return false;
            else if(t1.val!=t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;


    }
}
