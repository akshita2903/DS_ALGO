package BinaryTree;
import java.util.*;
//here path has to be starte from root only only root node is root and rest other are not root for calc sum
class Node{
    Node left,right;
    int data;
}
public class ksum_path_From_root {
    


    static Node nN(int x){
        Node y=new Node();
        y.data=x;
        y.left=null;
        y.right=null;
        return y;
    }
   
  static   ArrayList<Integer> path=new ArrayList<>();
    static void yespathroot(Node root,int k,int sum){
      
        if(root==null) return ;
        sum+=root.data;
        path.add(root.data);
       
        if(sum==k){
            print();
            
        }
         yespathroot(root.left,k,sum);
       
        yespathroot(root.right,k,sum);
        path.remove(path.size()-1);
    }
    static void print(){
        for(int j=0;j<path.size();j++)
        System.out.print(path.get(j)+" ");
        System.out.println();
        
    }
    public static void main(String str[]){
        Node root=nN(1);
        root.left=nN(3);
        root.right=nN(-1);
        root.left.left=nN(2);
        root.left.right=nN(1);
         root.left.right.left=nN(1);
          root.right.right=nN(5);
           root.right.right.right=nN(6);
            root.right.left=nN(4);
            root.right.left.left=nN(1);
             root.right.left.right=nN(2);
             yespathroot(root,6,0);
    }
}

    

