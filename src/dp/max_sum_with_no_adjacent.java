package dp;

public class max_sum_with_no_adjacent {
    int maxsum(int a[],int n){
        int dp[]=new int[n+1];
        dp[0]=0; dp[1]=a[0];
        for(int i=1;i<n;i++)
        {
            dp[i+1]=max(dp[i],a[i]+dp[i-1]);
        }
        return dp[n];
    }
    int max(int a,int b){
        return (a>=b)?a:b;
    }
    
}
