package arrays;
import java.util.*;
public class subarray_multiple_of_k {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int curr_sum=0;
        for(int i=0;i<nums.length;i++){
          curr_sum+=nums[i];
          curr_sum=curr_sum%k;
          if(mp.get(curr_sum)!=null)
          {
            int index=mp.get(curr_sum);
            if((i-index)>1) return true;
          }
          else mp.put(curr_sum,i);
        }
        return false;
          
      }
    
}
