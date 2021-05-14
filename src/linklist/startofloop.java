public class startofloop {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow=head,fast=head,prev_slow=head;
        while(slow!=null && fast!=null && fast.next!=null)
        { prev_slow=head;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow!=fast) return null;
       // if(slow==head) return prev_slow;
        slow=head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}
//time->O(n) ,space->O(n)
