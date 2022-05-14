package BinaryTree;
import java.util.*;
/*
Input: root = [1,2,3,4,5,6,7]
Output: [[4],[2],[1,5,6],[3],[7]]
Explanation:
Column -2: Only node 4 is in this column.
Column -1: Only node 2 is in this column.
Column 0: Nodes 1, 5, and 6 are in this column.
          1 is at the top, so it comes first.
          5 and 6 are at the same position (2, 0), so we order them by their value, 5 before 6.
Column 1: Only node 3 is in this column.
Column 2: Only node 7 is in this column.



Input: root = [1,2,3,4,6,5,7]
Output: [[4],[2],[1,5,6],[3],[7]]
Explanation:
This case is the exact same as example 2, but with nodes 5 and 6 swapped.
Note that the solution remains the same since 5 and 6 are in the same location and should be ordered by their values
*/

/*  **Use HashMap Instead of TreeMap t.c of treemap is O(log(N)) and hashmap is O(1)  */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Vertical_Order {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Vertical_View(root,ans);
        return ans;
        
    }
    private void Vertical_View(TreeNode root,List<List<Integer>> l){
        HashMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        int min=0,max=0;
        q.add(new Pair(root,0,0));
        while(q.size()>0){
            Pair p=q.poll();
            TreeNode curr=p.root; int level=p.level;
            int row=p.row;
            if(map.containsKey(level)==false) 
            {
                map.put(level,new TreeMap<Integer,PriorityQueue<Integer>>());
            }
            if(map.get(level).containsKey(row)==false)
            {
                map.get(level).put(row,new PriorityQueue<Integer>());
            }
            min=Math.min(min,level);
            max=Math.max(max,level);
            map.get(level).get(row).add(curr.val);
            if(curr.left!=null) q.add(new Pair(curr.left,level-1,row+1));
            if(curr.right!=null) q.add(new Pair(curr.right,level+1,row+1));
        }
  for(int i=min;i<=max;i++)
  {
      TreeMap<Integer,PriorityQueue<Integer>> p=map.get(i);
      List<Integer> temp=new ArrayList<>();
      for(int keys:p.keySet())
      {
          while(p.get(keys).size()>0)
              temp.add(p.get(keys).poll());
      }
      l.add(temp);
  }
    }
}
class Pair{
    TreeNode root;
    int level;
    int row;
    Pair(TreeNode root,int level,int row){
        this.root=root;
        this.level=level;
        this.row=row;
    }
}
