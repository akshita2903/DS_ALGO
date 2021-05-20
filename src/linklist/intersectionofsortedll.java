public class intersectionofsortedll {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if(headB==null || headA==null) return null;
       ListNode x=headA,y=headB;
       int a=0,b=0,d=0;
        while(x!=null)
        {
            a++;
            x=x.next;
        }
        while(y!=null) {
            b++;
            y=y.next;
        }
          x=headA;y=headB;
        if(a==0) return null;
        if(b==0) return null;

        else{
           if(a==b)
           {
               while(x!=null && y!=null)
               {
                   if(x==y) return x;
                   x=x.next;
                   y=y.next;
               }
           }
            if(a>b)
            {
                for(int i=0;i<(a-b);i++)
                {
                    if(x==null) break;
                    x=x.next;
                }
                if(x==null) return x;
                while(x!=null && y!=null)
                {
                    if(x==y) return x;
                    x=x.next;
                    y=y.next;
                }
            }
            else{
                for(int i=0;i<(b-a);i++)
                {
                    if(y==null) break;
                        y=y.next;
                }
                if(y==null) return y;
                while(x!=null && y!=null)
                {
                    if(x==y) return x;
                    x=x.next;
                    y=y.next;
                }
            }
        }

        return x;

    }

}
//time->O(m+N) and space->(1)
