public class mergeSort {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
       ListNode mid=middle(head);
        ListNode midnext=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(midnext);
        return sort(left,right);

    }
   public  ListNode middle(ListNode head)
    {
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode sort(ListNode x,ListNode y)
    {
        ListNode res=new ListNode(-1);
        ListNode h=res;
        while(x!=null && y!=null)
        {
            if(x.val<=y.val)
            {
                h.next=x;
                x=x.next;

            }
            else{
                h.next=y;
                y=y.next;
            }
            h=h.next;
        }
    h.next=(x==null)?y:x;
        return res.next;
    }
}
