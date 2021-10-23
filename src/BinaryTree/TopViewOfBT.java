package BinaryTree;
import java.util.*;
public class TopViewOfBT {
    static  class Pair{  
        Node x; int l;
         Pair(Node y,int level){
              x=y;
              l=level;
          }
      }
      static ArrayList<Integer> topView(Node root)
      {
          ArrayList<Integer> ans=new ArrayList<>();
         if(root==null) return ans;
         Queue<Pair> q=new LinkedList<Pair>();
         Map<Integer,Integer> mp=new TreeMap<>();
         q.add(new Pair(root,0));
         while(q.size()>0)
         {
             Pair p=q.poll();
             Node r=p.x; int levl=p.l;
             if(mp.get(levl)==null) {
               mp.put(levl,r.data);
             }
             if(r.left!=null)
             {
                 q.add(new Pair(r.left,levl-1));
             }
             if(r.right!=null){
                 q.add(new Pair(r.right,levl+1));
             }
         }
         for(Map.Entry<Integer,Integer> m:mp.entrySet()){
             ans.add(m.getValue());
         }
         return ans;
          
      }
}
