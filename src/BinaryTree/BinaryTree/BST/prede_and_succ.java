package BinaryTree.BinaryTree.BST;
class Node{
    Node left,right;
    int data;
}
class Res{
    Res pre,succ;
}
class prede_and_succ{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
if(root==null) return ;
if(root.data==key){
    if(root.left!=null){
        Node tmp=root.left;
        while(tmp.right!=null)
        tmp=tmp.right;
        p.pre=tmp;
    }
    if(root.right!=null){
        Node tmp=root.right;
        while(tmp.left!=null) tmp=tmp.left;
        s.succ=tmp;
    }
}
if(root.data>key) {
    s.succ=root;
    findPreSuc(root.left,p,s,key);
}
else if(root.data<key){
    p.pre=root;
    findPreSuc(root.right,p,s,key);
}
    }
    //-------------------------------//
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
if(root==null) return ;
findPreSuc(root.left,p,s,key);
if(s.succ!=null) return ;
if(key>root.data){
    p.pre=root;
}
if(key<root.data) s.succ=root;
if(s.succ!=null) return ;
findPreSuc(root.right,p,s,key);
    }
}