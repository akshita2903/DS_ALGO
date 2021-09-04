package BinaryTree.src.BinaryTree;

public class maxDepth {
    maxDepth root,left,right;
    maxDepth(maxDepth l,maxDepth r)
    {
this.left=l;
this.right=r;
    }
   // Solution s=new Solution(); solution exist in sam epackage binarytree

}
class Sol {
    int   ans;
    public int diameterOfBinaryTree(maxDepth root) {
        ans=0;
     ans=   maxdepth(root);
        return ans;
    }
    public int maxdepth(maxDepth root)
    {
        if(root==null) return 0;
        int left_height=maxdepth(root.left);
        int right_height=maxdepth(root.right);
        ans=Math.max(ans,(left_height+right_height));
        return 1+Math.max(left_height,right_height);
    }
}
//max depth->max(leftsubtreeheight,rightsubtreeheight,(leftsubtreeheight+rightsubtreeheight))
//time->O(n)