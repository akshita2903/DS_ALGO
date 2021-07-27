package BinaryTree.BinaryTree.BST;

public class trim_bst {
    
        public TreeNode trimBST(TreeNode root, int low, int high) {
            return trim(root,low,high);
            
        }
        TreeNode trim(TreeNode root,int l,int h){
          if(root==null) return root;
          else  if(root.val<=h && root.val>=l){
                root.left=trim(root.left,l,h);
                root.right=trim(root.right,l,h);
            }
            else  if(root.val>h){
                  root=trim(root.left,l,h);
                  
              }
          else  if(root.val<l){
                root=trim(root.right,l,h);
            }
            return root;
        }
    
    
}
