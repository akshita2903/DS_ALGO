﻿package BinaryTree.src.linklist;
class ListNode{

}
public class intersection_of_2_ll {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if(headB==null || headA==null) return null;
       ListNode x=headA,y=headB;
        while(x!=y)
        {
            if(x==null) x=headB;
            else x=x.next;
            if(y==null) y=headA;
            else y=y.next;
        }

        return x;

    }
}
