import java.util.*;
public class twoStack{
    int arr[]=new int[100];
    int top1=-1,top2=-1;
     public static void main(String[] args) {
         twostack ob=new twoStack();
         Stacks st=new Stacks();
         st.push1(5,ob);
         st.push1(2,ob);

    }
     twoStack(){
        int size=100;
        top1=-1;
        top2=size;

    }

class Stacks
{
    //Function to push an integer into the stack1.
    void push1(int x, twoStack sq)
    {
       if(sq.top1!=sq.top2) sq.arr[++(sq.top1)]=x;
    }

    //Function to push an integer into the stack2.
    void push2(int x, twoStack sq)
    {
if(sq.top2!=sq.top1)
sq.arr[--(sq.top2)]=x;
    }

    //Function to remove an element from top of the stack1.
    int pop1(twoStack sq)
    {
        if(sq.top1==-1) return -1;
        else{
            int y=sq.arr[sq.top1--];

            return y;
        }
    }

    //Function to remove an element from top of the stack2.
    int pop2(twoStack sq)
    {
         if(sq.top2==sq.size) {

             return -1;
         }
        else{
            int y=sq.arr[sq.top2++];

            return y;
        }

    }
}
}

