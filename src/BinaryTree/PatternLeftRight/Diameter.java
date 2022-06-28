package BinaryTree.PatternLeftRight;

public class Diameter {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int[] diameter=new int[1];
 height(root,diameter);
        return diameter[0];
        
    }
    int height(TreeNode root,int[] diameter){
        if(root ==null) return 0;
        int left=height(root.left,diameter);
        int right=height(root.right,diameter);

        diameter[0]=max(diameter[0],left+right);
                int h=max(left,right)+1;
        return h;
    }
    int max(int a,int b){
        return a>=b?a:b;
    }
}
/*LINK: https://leetcode.com/problems/diameter-of-binary-tree/

T>C-O(n)
 * Given the root of a binary tree, return the length of the diameter of the tree.

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.
 */