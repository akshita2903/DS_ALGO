package BinaryTree;
class No {
    No left,right; int data;
}
public class root_to_leafsum {
    public int sumOfLongRootToLeafPath(No root)
    { if(root==null) return 0;
       return soln(root);
    }
  
    int soln(No root){
   
        if(root==null) return 0;
    //   sum+=root.data;
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh>rh){
           
       return (root.data)+soln(root.left);
        }
        else if(rh>lh){
           
       return (root.data)+soln(root.right);
        }
        else{
          return root.data+max(soln(root.left),soln(root.right));  
        }
       
     //   return sum;
       
        
    }
    int height(No root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        return(max(lh,rh)+1);
    }
    int max(int a,int b){
        return (a>=b?a:b);
    }
    
}
