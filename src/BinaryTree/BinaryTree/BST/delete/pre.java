package BinaryTree.BinaryTree.BST.delete;
class TreeNode{
    TreeNode left,right;
    int val;
}

public class pre {
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode r=root;
        if(r==null) return root;
       if(key<root.val){
           root.left=deleteNode(root.left,key);
           return root;
       }
        else if(key>root.val){
           root.right=deleteNode(root.right,key);
           return root;
       }
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                root.val=inpre(root.left);
                root.left=deleteNode(root.left,root.val);
            }
        }
        return root;
        
    }
    int inpre(TreeNode root){
       int max=0;
        if(root!=null) max=root.val;
        while(root.right!=null){
            max=root.right.val;
            root=root.right;
        }
           
        
        return max;
    }
    
}
