import java.util.*;
 class threeSumClosest {
    public int threeSumCloset(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0,sum=0;

        ans=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++)
        {
           int low=i+1 ,high=n-1;
            while(low!=high)
            {
                sum=nums[i]+nums[low]+nums[high];
                if(Math.abs(target-sum)<Math.abs(ans)) ans=target-sum;
                if(sum>target) high--;
                else low++;
            }

        }
        return target-ans;
    }


}
//time->O(n2) and space->O(n)or O(logn)
