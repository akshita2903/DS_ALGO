package BinaryTree.PatternLeftRight;

public class maxSumPath {
    public int maxPathSum(TreeNode root) {
        int[] maxSum=new int[1];
        maxSum[0]=Integer.MIN_VALUE;
        findPath(root,maxSum);
        return maxSum[0];
    }
    int findPath(TreeNode root,int[] m_sum)
    {
        if(root == null) return Integer.MIN_VALUE;
        int left=max(0,findPath(root.left,m_sum));
        int right=max(0,findPath(root.right,m_sum));
      m_sum[0]=max(m_sum[0],left+right+root.val);
        System.out.println(" CURRENT ROOT "+root.val+" maximsum sum here "+m_sum[0]);
        
    //inclcuding node and max sum from left subtre or right subtree
    
        return root.val+max(left,right);
    }
    int max(int a,int b)
    {
        return a>=b?a:b;
    }
    
}
/*
Link:   https://leetcode.com/problems/binary-tree-maximum-path-sum/
A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path. */
