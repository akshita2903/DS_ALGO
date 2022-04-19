import java.util.*;
public class nextgreaterelement{
public static long[] nextLargerElement(long[] arr, int n)
{
    // Your code here
    long a[]=new long[n];
   a[n-1]=-1;
   Stack<Long> st=new Stack<>();
   for(int i=n-1;i>=0;i--)
   {
       if(!st.isEmpty())
       {
           while(!st.isEmpty() && (st.peek()<=arr[i])) st.pop();

       }
        a[i]=st.isEmpty()?-1:st.peek();
       st.push(arr[i]);
   }

   return a;
} }
//time->O(n) ans space->O(n)