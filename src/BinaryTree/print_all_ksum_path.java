package BinaryTree;
import java.util.*;
//AMAZON ,any node can be served as root for calculating sum in a path
class Node{
    Node left,right;
    int data;
}

public class print_all_ksum_path {
   
    
        static Node nN(int x){
            Node y=new Node();
            y.data=x;
            y.left=null;
            y.right=null;
            return y;
        }
       static ArrayList<Integer> path=new ArrayList<>();
        static void nopathroot(Node root,int k){
            
            if(root==null) return ;
            path.add(root.data);
            nopathroot(root.left,k);
            nopathroot(root.right,k);
            int f=0;
            for(int i=path.size()-1;i>=0;i--)
            {
                f+=path.get(i);
                if(f==k)
                print(path,i);
            }
            path.remove(path.size()-1);
        }
        static void print(ArrayList<Integer> l,int i){
            for(int j=i;j<l.size();j++)
            System.out.print(l.get(j)+" ");
            System.out.println("iuhdfigjidx");
            
        }
        public static void main(String str[]){
            Node root = nN(1);
        root.left = nN(3);
        root.left.left = nN(2);
        root.left.right = nN(1);
        root.left.right.left = nN(1);
        root.right = nN(-1);
        root.right.left = nN(4);
        root.right.left.left = nN(1);
        root.right.left.right = nN(2);
        root.right.right = nN(5);
        root.right.right.right = nN(2);
                 nopathroot(root,5);
        }
    }
     

