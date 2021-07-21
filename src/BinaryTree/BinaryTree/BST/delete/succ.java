package BinaryTree.BinaryTree.BST.delete;

public class succ {
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
                root.val=insucc(root.right);
                root.right=deleteNode(root.right,root.val);
            }
        }
        return root;
        
    }
    int insucc(TreeNode root){
       int min=0;
        if(root!=null) min=root.val;
        while(root.left!=null){
            min=root.left.val;
            root=root.left;
        }
           
        
        return min;
    }
}
