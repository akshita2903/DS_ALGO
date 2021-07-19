package BinaryTree;

public class sumroot_to_leaf {
 

    public int sumNumbers(TreeNode root) {
	
     return calculate_sum(root,0);           
    }
    int calculate_sum(TreeNode root,int current_sum){
        if(root==null) return 0;     //if there is no node left or there is no node in the tree(this is base condition)
        current_sum=current_sum*10+root.val; //else calculate sum for that curr_node 
        if(root.left==null && root.right==null) return current_sum ; //if its a leaf node(i.e at last level) or has a only one node return current_sum
        int left_tree_sum=calculate_sum(root.left,current_sum); //recursively calculate sum for left subtree
        int right_tree_sum=calculate_sum(root.right,current_sum); //recursively calculate sum for right subtree
        return left_tree_sum+right_tree_sum; //return their sum
    }
   
}
    

