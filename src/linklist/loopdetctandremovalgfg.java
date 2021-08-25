
package BinaryTree.src.linklist;
public class loopdetctandremovalgfg {
    public static void removeLoop(Node head){
        if(head==null || head.next==null) return ;
        
         Node slow=head,fast=head,prev_slow=head; int i=0;
        
         while(slow!=null && fast!=null && fast.next!=null)
         {
            
           
             prev_slow=slow;
             slow=slow.next;
             fast=fast.next.next;
             if(slow==fast) {
                 
                 break;
             }
         }
         if(slow==fast)
         {
           if(slow==head)
           {
           
               prev_slow.next=null;
               return ;
           }
           slow=head;
           while(slow.next!=fast.next)
           {
               slow=slow.next;
               fast=fast.next;
           }
           fast.next=null;
           
         }
       }
       //time->O(n) and space->(1) n->size of link list
    
}
