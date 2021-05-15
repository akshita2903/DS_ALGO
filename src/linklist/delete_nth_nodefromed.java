public class delete_nth_nodefromed {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr=head,tmp=head; int c=0,p=0;
        while(ptr!=null)
        {
            c++;
            ptr=ptr.next;
            
        }
        ptr=head;
        if(n>c) return head;
        if(n==c) {
            head=ptr.next;
            return head;
        }
        p=1;
        while(ptr!=null &&p<(c-n))
        {
            p++;
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
       
       return head;
        
    }
    
}
