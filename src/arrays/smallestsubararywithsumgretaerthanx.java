package arrays;
import java.util.*;
public class smallestsubararywithsumgretaerthanx {
    public static long sb(long a[], long n, long x) {
        // Your code goes here 
        long min_len=Long.MAX_VALUE,sum=0l;
        int n1=a.length,left=0;
        for(int i=0;i<n1;i++) //O(n)->time
        {
          sum+=a[i];
         if(a[i]>x) return 1;
          while(sum>x && left<=i) //O(i)->time
          {
              
              
              min_len=Math.min(min_len,i-left+1);
              sum-=a[left];
              left++;
          }
        }
        return min_len;
    
    }
}
//space->O(1) and time O(n*i)
