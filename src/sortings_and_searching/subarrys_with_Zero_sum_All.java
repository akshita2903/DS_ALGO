package sortings_and_searching;
import java.util.*;
public class subarrys_with_Zero_sum_All {
    public long count(long a[],int n){
        long p[]=new long[n];
        HashMap<Long,Integer> mp=new HashMap<>();
        long c=0L;
        p[0]=a[0];
        if(p[0]==0){
            c++;
           
        }
       mp.put(p[0],1);
       for(int i=1;i<n;i++){
           p[i]=a[i]+p[i-1];
           if(mp.containsKey(p[i])){
               c+=mp.get(p[i]);
               mp.put(p[i],mp.get(p[i])+1);
           }
           else mp.put(p[i],1);
       }
        return c;
    }
    
}
//time->O(n) ans space->O(1)
