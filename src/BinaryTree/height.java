 package BinaryTree.src.BinaryTree;

public class height {
    height left,right;
    height(height l,height r){
this.left=l;
this.right=r;
    }
    height start;
     Solution s=new Solution();
     int z=s.maxDepth(start);

}



   class Solution {

       public int maxDepth(height root) {
           if(root==null) return 0;

          int     l=   maxDepth(root.left) ;
                 int  r=maxDepth(root.right);
              return Math.max(l+1,r+1);

       }
    }
