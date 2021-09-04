package BinaryTree;

public class min_dist_bw_two_node {
    int findDist(Node root, int a, int b) {
        return distance(root,a,b);
    
    }
    int c=0; boolean a1=false,b1=false;
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
    int distance(Node r,int a,int b){
       Node lca=lca(r,a,b); int x=0,y=0;
       if(a1==true && b1==true){
       x=fd(lca,a,0);
       y=fd(lca,b,0);
       return x+y;
       }
       return -1;
       
      
    }
    int fd(Node r,int a,int level){
        if(r==null) return -1;
        if(r.data==a) return level;
        int l=fd(r.left,a,level+1);
        if(l!=-1) return l;
        int ri=fd(r.right,a,level+1);
        return ri;
    }
    
}
