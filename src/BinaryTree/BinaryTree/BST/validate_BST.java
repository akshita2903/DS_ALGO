import java.util.*;
class TreeNode {
    TreeNode left,right; int val;
}
class validate_BST {
    public boolean isValidBST(TreeNode root) {
       return isvalid(root);
    }
    boolean isvalid(TreeNode root){
        ArrayList<Integer> l=new ArrayList<>();
    inorder(root,l);
       // int pre=l.get(0);
        for(int i=1;i<l.size();i++){
            int x=l.get(i);
            int pre=l.get(i-1);
            if(x<=pre) return false;
            
        }
        return true;
    }
    void inorder(TreeNode r,ArrayList<Integer> l){
        if(r==null) return;
        inorder(r.left,l);
        l.add(r.val);
        inorder(r.right,l);
    }
       

//USING STACk
boolean chktreeforbst(TreeNode root){
Stack<TreeNode>st=new Stack<>();
TreeNode prev=null;
if(root==null) return true;
while(root!=null ||!st.empty()){
    while(root!=null){
        st.push(root);
        root=root.left;
    }
    root=st.pop(); //get the node pushed last int the stack;
    //to check if prev has already stored any node and its >curnode(since we travesring frm left so last node netr will be wither from left or below root)
    if(prev!=null && root.val<=prev.val ) return false;
    root=root.right;
}
return true;
}
}