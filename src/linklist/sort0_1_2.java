public class sort0_1_2 {
    static Node segregate(Node head)
    {
        // add your code here
        Node temp=head;
        int c[]=new int[3]; int j=0;
        while(temp!=null)
        {
            int v=temp.data;
            c[v]++;
            temp=temp.next;
            j++;
        }
        int i=0; temp=head;
        while(i<3)
        {
            if(c[i]==0) i++;
            else{
               temp.data=i;
               c[i]--;
               temp=temp.next;
               
            }
        }
        return head;
    }
    
}
