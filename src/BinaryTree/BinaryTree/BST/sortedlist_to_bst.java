package BinaryTree.src.BinaryTree.BinaryTree.BST;
import.java.util.*;


public class sortedlist_to_bst {
    
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        ListNode prev=head;
       return insert(head,null);
        
    }
    //O(1) space and te-O(n)
   TreeNode insert(ListNode head,ListNode prev){
       if(head==prev) return null;
   ListNode slow=head,fast=head;//prev_slow=null;;
       while(slow!=prev && fast!=prev && fast.next!=prev)
       { //prev_slow=slow;
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast) break;
       }
       TreeNode root=new TreeNode(slow.val);
       root.left=insert(head,slow);
       root.right=insert(slow.next,prev);
       return root;
   }   
}
//Sppace->O(n) and time->O(1)(naive approach)
// public TreeNode sortedListToBST(ListNode head) {
//     if(head==null) return null;
//     ArrayList<Integer> l=new ArrayList<>();
//     while(head!=null){
//         l.add(head.val);
//         head=head.next;
//     }
//     return insert(l,0,l.size()-1);
    
// }
// TreeNode insert(ArrayList<Integer> l,int s,int e){
//     if(s>e) return null;
//     int mid=(s+e)/2;
//     int data=l.get(mid);
//     TreeNode root=new TreeNode(data);
//     root.left=insert(l,s,mid-1);
//     root.right=insert(l,mid+1,e);
//     return root;
// }
