package BinaryTree;
class find_LCA{
  //Function to return the lowest common ancestor in a Binary Tree.
     boolean find_n1=false,find_n2=false; 
	Node lca(Node root, int n1,int n2)
	{
	    if(root==null) return null;
	    Node LCA=find_it(root,n1,n2);
	    if(find_n1 && find_n2) return LCA;
	    return null;
	    
}
Node find_it(Node r,int x,int y){
    if(r==null) return r;
    Node temp=null;
    if(r.data==x){
        temp=r;
        find_n1=true;
    }
     if(r.data==y){
        temp=r;
        find_n2=true;
    }
  
    Node left=find_it(r.left,x,y);
    Node right=find_it(r.right,x,y);
    if(temp!=null) return temp;
    
    return (left!=null && right!=null)?r:(left==null)?right:left;
}

}
