public class reversell {
    //Iterative
    public ListNode reverseList(ListNode head) {
        ListNode temp=head,curr=null,prev=null;
       while(temp!=null)
       {
          curr=temp.next;
           
           temp.next=prev;
           prev=temp;
           temp=curr;
       }
        temp=curr;
        return prev;
       
    } //time->O(n) ,n->size of link list,Space->O(1)
    
}
