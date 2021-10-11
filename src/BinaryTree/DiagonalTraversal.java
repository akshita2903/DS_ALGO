package BinaryTree;
import java.util.*;
class Node{
  Node left,right; int data;
  Node(int d)
  {
    this.data=d;
    this.left=null;
    this.right=null;
  }
}
/*
            8
         /     \
        3      10             slope of -1=8 10 14
      /   \      \                        13
     1     6     14                       3 6 7
         /   \   /                        1 4
        4     7 13
Output : 8 10 14 3 6 7 13 1 4
*/
class DiagonalTraversal
{
    public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           Queue<Node> q=new LinkedList<>();
           ArrayList<Integer> res=new ArrayList<>();
           q.add(root);
           while(q.size()>0)
           {
               Node y=q.poll();
               while(y!=null)
               {
                   if(y.left!=null)
                   q.add(y.left);
                   res.add(y.data);
                   y=y.right;
               }
           }
           return res;
      }
}
