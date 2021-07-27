package BinaryTree.BinaryTree;
import java.util.*;
public class tree_t_mirror {
   TreeNode mirror(TreeNode root){
       if(root==null) return root;
TreeNode r=new TreeNode(root.val);
r.left=mirror(root.right);
r.right=mirror(root.left);
return r;
   } 
   //From level order
   TreeNode mirror1(TreeNode r){
       if(r==null) return r;
Queue<TreeNode> q=new LinkedList<>();
q.add(r);
while(!q.isEmpty()){
    TreeNode x=q.poll();
    TreeNode left=x.left;
    x.left=x.right;
    x.right=left;
    if(x.left!=null) q.add(x.left);
    if(x.right!=null) q.add(x.right);

}
       return r;
   }
}
