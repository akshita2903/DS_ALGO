public class add_two_link {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode y=null,x=null,temp=null;
        int sum=0;
         while(l1!=null ||l2!=null)
         {
             sum+=((l1!=null)?l1.val:0)+((l2!=null)?l2.val:0);
             temp=new ListNode(sum%10);
             sum/=10;
             if(x==null) x=temp;
             else y.next=temp;
             y=temp;
             if(l1!=null) l1=l1.next;
             if(l2!=null) l2=l2.next;
         }
         if(sum>0){
             temp=new ListNode(sum);
             y.next=temp;
         }
         return x;
         
         
         
     }

    
} //time->MAX(O(n) ,O(m)),space->O(n)
