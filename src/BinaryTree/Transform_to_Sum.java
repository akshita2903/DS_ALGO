package BinaryTree;
class Transform_to_Sum{
public void toSumTree(Node root){
       /* if(root==null){return ;}
       else   if(root.right==null&&root.left==null){root.data=0; return ;} //do nothing
     int x=0,y=0;
     x=(root.left==null)?0:root.left.data;
     y=(root.right==null)?0:root.right.data;
     root.data=x+y;
      toSumTree(root.left);
      toSumTree(root.right);
      if(root.left!=null) root.data+=root.left.data;
      if(root.right!=null) root.data+=root.right.data;
      int temp=root.data;
      root.data=toSumTree(root.left)+toSumTree(root.right);
      root.data+=temp; */
      if(root==null) return ;
      
       int left=Sum(root.left);
       int right=Sum(root.right);
       root.data=left+right;
       toSumTree(root.left);
       toSumTree(root.right);
    }
    int Sum(Node root){
       if(root==null) return 0;
       
     return (Sum(root.left)+Sum(root.right)+root.data);
      
      
    }
}
