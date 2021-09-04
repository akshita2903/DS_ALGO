package arrays;
    import java.util.*;
public class chcolatedistribution {
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        int n1=a.size();
        int m1=(int)m;
        Collections.sort(a); //O(nlogn)
        Long diff=Long.MAX_VALUE;
        m1--;
        for(int i=0;i<n1;i++) // timeo(n)
        { if(i+m1<n)
            diff=Math.min(diff,a.get(i+m1)-a.get(i));
        }
        return diff;
    }
    
}
//space-O(1) and time-O(nlogn)

    

