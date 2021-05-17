public class add_one_to_ll {
    public static Node addOne(Node head) 
    { 
        //code here.
        if(head==null ) return null;
       Node rev=reverse(head),temp=rev,prev=temp; //O(n) rev
       int carry=0;
      int v=temp.data;
      if(v>8)
      {
          temp.data=0;
          carry=1;
      }
      else{
          carry=0;
          temp.data=v+1;
      }
      if(temp!=null) temp=temp.next;
     
       while(temp!=null) //o(n) 
       {
           int x=temp.data+carry;
           if(x>9)
           {
               temp.data=0;
               carry=1;
           }
           else{
               temp.data=x;
               carry=0;
           }
           prev=temp; //if in last carry remains this pinter helps tget last node 
           temp=temp.next;
       }
       if(carry==1)
       {
           Node n=new Node(carry);
           if(prev!=null)
           prev.next=n;
           else prev=n;
           
       }
       return reverse(rev);
       
    }
    public static Node reverse(Node head)
    {  
        if(head==null || head.next==null) return head;
        Node temp=head,curr=head,rev=null;
        while(temp!=null) //find reverse
       {
           curr=temp.next;
           temp.next=rev;
           rev=temp;
           temp=curr;
       }
       return rev; //O(n) for worst case
    }
    
}
//time->O(n) and space->O(n)