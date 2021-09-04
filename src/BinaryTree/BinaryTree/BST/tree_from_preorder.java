class tree_from_preorder
{
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode bst=findbst(preorder,preorder.length,Integer.MAX_VALUE);
        return bst;
    }
    int i=0;
   
    TreeNode findbst(int p[],int n,int max)
    {
       if(i>=n || p[i]>max) return null;
        TreeNode root=new TreeNode(p[i++]);
        root.left=findbst(p,n,root.val);
        root.right=findbst(p,n,max);
        return root;
    }
  
  
  
}




























