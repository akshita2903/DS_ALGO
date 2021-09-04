import java.util.*;
class Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
       List<String> ans=new ArrayList<>();
        int n=nums.length;
        if(n==1)
        {
            ans.add(Integer.toString(nums[0]));
            return ans;
        }
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            while(i<n-1 && nums[i]+1==nums[i+1])
                i++;
            if(i<n && nums[i]!=a) ans.add(Integer.toString(a)+"->"+Integer.toString(nums[i]));
            else ans.add(Integer.toString(a));
          
            
        }
        return ans;
    }
  
}
