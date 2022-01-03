package com.akshita;
//clone ll with next and random pointer,create deep copy and no change in original ll
public class RandomLL {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node p=head;




        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        two.next=three;
        two.random=head;
        four.next=null;
        four.random=two;
        three.next=four;
        three.random=null;
        head.next=two;
        head.random=four;
        print(head);
        System.out.println("After ");
        copyNode(head);
        RandomPointer(head);
getDeepCpy(head);
print(head);




    }
   static Node getDeepCpy(Node head){

        Node dummy=new Node(-1);
        Node curr=head,ans=dummy;
        while(curr!=null){
            //store next of original ll
            Node next=curr.next.next;
            //copy the ciopied ll
            Node copy=curr.next;
            ans.next=copy;
            ans=copy;
            curr.next=next; //restore original ll
            curr=next;
        }
        return dummy.next;
    }
    static void print(Node head){
        while(head!=null){
            System.out.println(head.val+" "+(head.random!=null?head.random.val:0)+" "+(head.next!=null?head.next.val:"00"));
            head=head.next;
        }
    }
    static void RandomPointer(Node head){
        Node rand=head,curr=head;
        while(curr!=null){
           // curr.next.random=curr.random.next;
            curr.next.random=curr.random==null?null:curr.random.next;
            curr=curr.next.next;
        }
    }
    static void copyNode(Node head){
        Node copy=head,curr=head;
        while(curr!=null){
            Node cpy=new Node(curr.val);
            cpy.next=curr.next;
            curr.next=cpy;
            curr=cpy.next;

        }
    }
}





class Node {
    int val;
    Node next;
    Node random;
Node(){
    this.next=null;
    this.random=null;
}
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
