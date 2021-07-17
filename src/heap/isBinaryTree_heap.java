package heap;
class Node{
    Node left,right;
    int data;
}
public class isBinaryTree_heap {
    boolean isHeap(Node tree)
	{
	if(tree==null || (tree.left==null && tree.right==null)) return true;
	Node left=tree.left;
	Node right=tree.right;
		if(right!=null && left==null) //for complete binary tree 
		//1-all level filled and should be as left as possible
	return false;
	if(left!=null && right==null)
	return ((tree.data>=left.data) && isHeap(left));

else	return((tree.data>=left.data) &&(tree.data>=right.data) && isHeap(left) && isHeap(right));
	
	}
}
