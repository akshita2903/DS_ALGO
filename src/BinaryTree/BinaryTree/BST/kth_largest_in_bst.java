package BinaryTree.BinaryTree.BST
class kth_largest_in_bst{
public int kthLargest(Node root,int K)
    {    if(root==null) return -1;
       
        ArrayList<Integer>l=new ArrayList<>();
        inorder(root,l);
        int size=l.size();
     int x=   l.get(size-K);
     return x;
    }
    void inorder(Node root,ArrayList<Integer>l){
        if(root==null) return ;
        inorder(root.left,l);
        l.add(root.data);
        inorder(root.right,l);
    }
  


}
