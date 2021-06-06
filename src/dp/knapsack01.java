
public class knapsack01{
    static int knapSack(int W, int wt[], int val[], int n)
    {
        int dp[][]=new int[W+1][n+1];
        for(int i=1;i<=W;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(wt[j-1]<=i)
    dp[i][j]=Math.max(dp[i-wt[j-1]][j-1]+val[j-1],dp[i][j-1]);
    else dp[i][j]=dp[i][j-1];
            }
        }
        return dp[W][n];
    }
}
//time->O(W*n) and space->O(W*n)