package sortings_and_searching;
import java.util.*;
public class triplets_with_sum_lessthan_x {
    long countTriplets(long arr[], int n,int sum)
    {
Arrays.sort(arr);
return counted(arr,n,sum);
    }
    long counted(long a[],int n,int x){
        long c=0L,sum=0L;
        for(int i=0;i<n-2;i++){
            int left=i+1,right=n-1;
            while(left<n && left<right){
                sum=a[i]+a[left]+a[right];
                if(sum>=x) right--;
                else{
                   c+=(right-left); //before a[right] sum is always x
                   left++;
                }
            }
        }
          
        
        return c;
    }
    
}
//two-pointer + sorting
//time->O(n^2) and space->O(1)-------------->BETTER
//----naive------
//time->O(n^3)  using three for loops

