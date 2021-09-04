
class Node{
    Node root,left,right;
}
public class balancedtree {
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
        if(root==null) return true;
	int l=height(root.left);
	int r=height(root.right);
	int x=Math.abs(l-r);
	return ((x<=1) && isBalanced(root.left) && isBalanced(root.right));
    }
    int height(Node root){
        if(root==null) return 0;
        int l=height(root.left);
        int r=height(root.right);
        return Math.max(l,r)+1;
    }
    
}
