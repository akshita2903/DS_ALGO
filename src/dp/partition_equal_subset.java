package dp;
public class partition_equal_subset {

    public boolean canPartition(int[] nums) {

        int sum=0;
        for(int i:nums) sum+=i;
        if(sum%2!=0) return false;
        sum/=2;
       return findsum(sum,nums,nums.length);

    }
    int z=0,z1=0;
    private boolean findsum(int sum,int a[],int n)
    {
       /* if(n==0) return false;
        if(sum==0) return true;
    if(a[n-1]<=sum)
    {
return ((findsum(sum-a[n-1],a,n-1)) || findsum(sum,a,n-1));

    }
 return  findsum(sum,a,n-1);*/
        boolean dp[][]=new boolean[sum+1][n+1];
        for(int i=0;i<=sum;i++) dp[i][0]=false;

        for(int j=0;j<=n;j++) dp[0][j]=true;
        for(int i=1;i<=sum;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(a[j-1]<=i)
                dp[i][j]=(dp[i-a[j-1]][j-1] || dp[i][j-1]);
                else
                    dp[i][j]=dp[i][j-1];
            }
        }
        return dp[sum][n];





    }
}
//time->O(n*sum) and space->O(sum*n);