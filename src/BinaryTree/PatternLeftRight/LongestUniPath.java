package BinaryTree.PatternLeftRight;

public class LongestUniPath {
    public int longestUnivaluePath(TreeNode root) {
        if(root ==null ) return 0;
        int[] max=new int[1];
        LPU(root,root.val,max);
        return max[0];
        
    }
    int LPU(TreeNode root,int value,int[] max)
    {
        if(root ==null) return 0;
        int left=LPU(root.left,root.val,max);
        int right=LPU(root.right,root.val,max);
        max[0]=max(max[0],left+right);
        return  (root.val== value)?max(left,right)+1:0;
    }
    int max(int a,int b)
    {
        return a>=b?a:b;
    }
}
/*Link: https://leetcode.com/problems/longest-univalue-path/
 * 
 * Given the root of a binary tree, return the length of the longest path, where each node in the path has the same value. This path may or may not pass through the root.

The length of the path between two nodes is represented by the number of edges between them.
 * T>C-O(n)
 */
