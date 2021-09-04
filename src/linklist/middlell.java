package linklist;
public class middlell {
  /*  middlell next;
    int data;
    class Solution{
        public middlell middleNode(middlell head) {
            int c=0;
            middlell ptr=head;
            while(ptr!=null) {
                c++;
                ptr=ptr.next;
            }
            int j=1;ptr=head;
                while(j<=c/2)
                {
                    ptr=ptr.next;
                    j++;
                }
            return ptr;  //O(n) ans pace->O(n)

        }
    }
    public static void main(String[] args) {
        middlell md=new middlell();

    }*/
    public middlell middleNode(middlell head) {
        middlell s=head,f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            }
        return s; //time->O(n) and space->o(1)
    }

}
