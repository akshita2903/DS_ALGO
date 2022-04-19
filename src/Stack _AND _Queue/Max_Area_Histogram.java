import java.util.*;
/*N = 7
arr[] = {6,2,5,4,5,1,6}
Output: 12
-----APPROACH------
1-//find index of elment on left of curr element which is just smaller then current elment
2-//find index of elment on right of curr element which is just smaller then current elment
3-max_area of curr elemt=(next_index-prev_index)*cuur elmt
 */
class Max_Area_Histogram{

    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
       long[] pse=new long[hist.length];
       long[] nse=new long[hist.length];
       next(hist,nse,hist.length);
       prev(hist,pse,hist.length);
       long max_area=0L;
       for(int i=0;i<hist.length;i++)
       {
          max_area=max(max_area,(nse[i]-pse[i]-1L)*hist[i]);
       }
      return max_area;
       
      
        
    }
    //find index of elment on right of curr element which is just smaller then current elment
    static void next(long[] a,long[] next,int n)
    {
        Stack<Integer> st=new Stack<>();
        next[n-1]=(long)n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            while(st.isEmpty()==false && a[st.peek()]>=a[i])
            st.pop();
            if(st.isEmpty()) next[i]=(long)n;
            else next[i]=(long)st.peek();
            st.push(i);
        }
    }
    ////find index of elment on left of curr element which is just smaller then current elment
    static void prev(long[] a,long[] prev,int n)
    {
        Stack<Integer> st=new Stack<>();
        prev[0]=-1L;
        st.push(0);
        for(int i=1;i<n;i++)
        {
            while(st.isEmpty()==false && a[st.peek()]>=a[i])
            st.pop();
            if(st.isEmpty())
            prev[i]=-1L;
            else prev[i]=(long)st.peek();
            st.push(i);
            
        }
    }
    
    static long max(long a,long b)
    {
        return a>=b?a:b;
    }
}