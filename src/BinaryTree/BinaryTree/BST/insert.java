package BinaryTree.BinaryTree.BST;
public class insert {
    //Function to insert a node in a BST.
    Node insert(Node root, int Key)
    {
        if(root==null){
            root=new Node(Key);
            
            return root;
        }
        
    if(Key==root.data){}
      else  if(Key<root.data){
            root.left=insert(root.left,Key);
        }
       else root.right=insert(root.right,Key);
    return root;
    }
}
