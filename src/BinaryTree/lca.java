package BinaryTree;

public class lca {
    boolean a1=false,b1=false;
    Node lca(Node r,int a,int b){
        if(r==null) return r;
        Node temp=null;
        if(r.data==a){
            a1=true;
        temp=r;
        }
        if(r.data==b){
            b1=true;
            temp=r;
        }
        Node left=lca(r.left,a,b);
        Node right=lca(r.right,a,b);
        if(temp!=null) return temp;
        if(left!=null && right!=null) return r;
        return (left==null)?right:left;
        
    }
    
}
