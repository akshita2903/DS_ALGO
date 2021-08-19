import java.util.*;
class unbounded_knapsack{
    static int knapSack(int n, int W, int val[], int wt[])
    {
        // code here
       
     return knapsack(n,W,val,wt);
    }
    static int knapsack(int n,int W,int[] val,int[] wt){
        int[][] dp=new int[n+1][W+1];
      
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else{
            if(wt[i-1]<=j)
            {
              int x=val[i-1]+dp[i][j-wt[i-1]];
              int y=val[i-1]+dp[i-1][j-wt[i-1]];
              int z=dp[i-1][j];
              dp[i][j]=max(x,max(y,z));
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
                }
            }
        }
        return dp[n][W];
    }
    static int max(int a,int b){
        return a>=b?a:b;
    }
}