package dp;
//unbounde knapsack see line ->13
class coin_change{
    public long count(int S[], int m, int n) 
    { 
        long dp[][]=new long[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0) dp[i][j]=0L;
                else if(j==0) dp[i][j]=1L;
                else if(i>0 && j>0){
                    if(S[i-1]<=j)
                    dp[i][j]=dp[i][j-S[i-1]]+dp[i-1][j];
                    else dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[m][n];
    } 
}