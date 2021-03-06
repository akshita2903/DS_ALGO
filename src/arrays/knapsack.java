package arrays;
class knapsack{ 
static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here 
        /* if(n==0 || W==0) return 0;
        {/Memoization
        if(dp[W][n]!=-1) return dp[W][n];
        }
         if(wt[n-1]<=W)                                                                              |memoization
         return Math.max((val[n-1]+knapSack(W-wt[n-1],wt,val,n-1)), //{dp[W][n]= Math.max((val[n-1]+knapSack(W-wt[n-1],wt,val,n-1)),   knapSack(W,wt,val,n-1));}
         knapSack(W,wt,val,n-1));
         else return knapSack(W,wt,val,n-1); */  //Recursion instead ofreturn use dp[W][n]
    //return dp[W][n]
    //DP SOlution Tabulated
         int dp[][]=new int[W+1][n+1];
         for(int i=0;i<=W;i++) dp[i][0]=0;
         for(int i=0;i<=n;i++) dp[0][i]=0;
         for(int i=1;i<=W;i++)
         {
             for(int j=1;j<=n;j++)
             {
                 if(wt[j-1]<=i)
                 dp[i][j]=Math.max((val[j-1]+dp[i-wt[j-1]][j-1])
                 ,dp[i][j-1]);
                 else dp[i][j]=dp[i][j-1];
             }
         }
         return dp[W][n];
    } 
}
//time complexity->O(W*n) for memoizationa and tabulated one
//space->O(W*n) for memoization and tabulated
