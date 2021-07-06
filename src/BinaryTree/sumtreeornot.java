package BinaryTree;

public class sumtreeornot{
    public boolean isSum (Node r){
        if(r==null) return true;
        return (r.data==(sum(r.left)+sum(r.right)) && isSum(r.left) && isSum(r.right));

    }
    int sum(Node r){
        if(r==null) return 0;
        if(r.left==null && r.right==null) return r.data;
        return sum(r.left)+sum(r.right)+r.data;
    }
}
