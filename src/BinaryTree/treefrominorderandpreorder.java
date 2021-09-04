package BinaryTree;
   class TreeNode {
      int val;
    TreeNode left;
    TreeNode right;
         TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }


class treefrominorderandpreorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      
        return tree(preorder,inorder,0,0,inorder.length-1);
        
    }
    /*ps=preorder start index
    *pe=preorder end index
    *is=inorder start index
    *ie=inoredr end index
    flars=find index whose left and right are the left and right subtree of given bt*/
    
    public TreeNode tree(int pre[],int in[],int ps,int is,int ie)
    {
        if(ps>pre.length-1 || is>ie ) {return null;}
      int x=pre[ps];
        TreeNode root=new TreeNode(x);
        
        int flars=find(in,x,is,ie);
       
        root.left=tree(pre,in,ps+1,is,flars-1);
            root.right=tree(pre,in,ps+flars-is+1,flars+1,ie);
        return root;
    }
    public int find(int a[],int x,int s,int e){
        int indx=0;
        for(int i=s;i<=e;i++)
            if(a[i]==x) {
                indx=i;
                break;
            }
                return indx;
       
    }
}
