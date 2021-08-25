package BinaryTree.src.linklist;
class Node{
    Node next,prev;
}
public class reversedoublyll {
    public static Node reverseDLL(Node  head)
{
    //Your code here
    Node newprev=null,newnext=null;
    while(head!=null)
    {
       newnext=head.next;
       head.next=newprev;
       head.prev=newnext;
       newprev=head;
       head=newnext;
    }
    return newprev;
} //time->O(n) and space->O(n)
}
