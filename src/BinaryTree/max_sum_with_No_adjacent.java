package BinaryTree;
import java.util.*;
class Node{
    Node left,right; int d;
   
   
};

public class max_sum_with_No_adjacent {
    static Node nN(int x){
        Node y=new Node();
        y.d=x;
        y.left=null;
        y.right=null;
        return y;
    }
    static int maxsum(Node n,HashMap<Node,Integer> mp,int s){
           System.out.println("maxsummmm"+s);
        if(n==null) return 0;
        if(n.left==null && n.right==null) return n.d;
        if(mp.containsKey(n))
        return mp.get(n);
        int including=n.d+findfor(n,mp,s);
        int excluding=findfor(n.left,mp,s)+findfor(n.right,mp,s);
        int max=max(including,excluding);
        mp.put(n,max);
        System.out.println("HASHMAP"+mp.get(n));
        return mp.get(n);
    }
    static int findfor(Node n,HashMap<Node,Integer> mp,int s){
       System.out.println("SUMMM"+s);
        if(n.left!=null){
        s+=maxsum(n.left.left,mp,s)+maxsum(n.left.right,mp,s);
          System.out.println("SUM is left"+s+"Node "+n.d);
        }
        if(n.right!=null){
        s+=maxsum(n.right.right,mp,s)+maxsum(n.right.left,mp,s);
        System.out.println("SUM is right"+s+"Node "+n.d);}
        return s;
    }
    static int max(int a,int b){
        return (a>=b)?a:b;
    }
   
    public static void main(String a[]){
        
//          1
//     -2       3
//   4   5  -6   2
     Node root = nN(1);
        root.left = nN(2);
        root.right = nN(3);
        root.right.left = nN(4);
        root.right.right = nN(5);
        root.left.left = nN(1);
    HashMap<Node,Integer> mp=new HashMap<>();
    System.out.println("answer is"+maxsum(root,mp,0));
        
    }
    
}
