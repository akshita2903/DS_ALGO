package BinaryTree;
import java.util.*;
class Nod{
    Nod left,right; int d;
   
};
public class subtree_with_max_sum {
   

    static Nod nN(int x){
        Nod y=new Nod();
       y.d=x;
       y.left=null;
       y.right=null;
       return y;
    }
    static int maxsum=0;
    
    static int fms(Nod r,int ms){
        if(r==null) return 0;
       int sum=r.d+fms(r.left,ms)+fms(r.right,ms);
      // int x=fms(r.left)+fms(r.right);
       ms=max(sum,ms);
       return ms; 
    }
    static int max(int a,int b){
        return (a>=b)?a:b;
        
    }
    public static void main(String a[]){
        
//          1
//     -2       3
//   4   5  -6   2
     Nod root = nN(1);
    root.left = nN(-2);
    root.left.left = nN(4);
    root.left.right = nN(5);
     root.right = nN(3);
    root.right.left = nN(-6);
   
    root.right.right = nN(2);
    System.out.println(fms(root,-10000));
        
    }
}

    

