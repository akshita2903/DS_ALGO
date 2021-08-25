
package BinaryTree.src.linklist;

import java.util.*;
class ListNode{
    ListNode next; int val;
    public ListNode(int x){
        this.val=x;
        this.next=null;
    }
}

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *
 * }
 */
class addtwoll {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1!=null)
        {
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null)
        {
            s2.push(l2.val);
            l2=l2.next;
        }
        ListNode head=new ListNode(-1);
        int sum=0;
        while(!s1.isEmpty()||!s2.isEmpty())
        {
            sum+=(!s1.isEmpty())?s1.pop():0;
            sum+=(!s2.isEmpty())?s2.pop():0;
            head.val=sum%10;
            ListNode t=new ListNode(sum/10); //carry;
            t.next=head;
            head=t;
            sum/=10;
        }
        return( (head.val==0)?head.next:head);

    }
}
