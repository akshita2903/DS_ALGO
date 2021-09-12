package dp;
class target_Sum{
    public int findTargetSumWays(int[] nums, int target) {
      int sum=0;
      for(int i:nums) sum+=i;
      return ((sum<target)||(sum+target)%2==1)?0:count(nums,(sum+target)/2);
  
        
    }

 
    private int count(int[] a, int sum){
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        for (int x:a) {
            for (int j = sum; j >= x; j--) {
                dp[j] += dp[j -x];
            }
        }
        return dp[sum];
    }
  
}
