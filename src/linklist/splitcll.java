public class splitcll {
    void splitList(circular_LinkedList list)
    {
        Node head=list.head,slow=head,fast=head,fastpr=null,prev=null;
        if(head==null|| head.next==null)
        {
            list.head1=head;
            list.head2=null;
        }
        while( fast.next!=head)
        {
            prev=slow;
            slow=slow.next;
            fastpr=fast;
            fast=fast.next.next;
            if(fast==head) break;
        }
        if(fast==head)//even
        {
            prev.next=head;
            fastpr.next.next=slow;
            list.head1=head;
            list.head2=slow;
        }
        else{
            fast.next=slow.next;
            list.head2=slow.next;
            slow.next=head;
            list.head1=head;


        }




    }
          
}
