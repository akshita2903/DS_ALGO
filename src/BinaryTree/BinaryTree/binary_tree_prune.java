package BinaryTree.BinaryTree;
public class TreeNode {
    int val;
   TreeNode left;
       TreeNode right;
        TreeNode() {}
    TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
      this.left = left;
           this.right = right;
       }
   }

public class binary_tree_prune {
    

    public TreeNode pruneTree(TreeNode root) {
           
           return pruned(root);
           
       }
       TreeNode pruned(TreeNode r){
           if(r==null) return r;
      
         r.left=  pruned(r.left);
          r.right= pruned(r.right);
            if(r.val==0 && r.left==null && r.right==null) return null;
           return r;
           
       }
   }