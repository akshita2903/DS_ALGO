package dp;
public class binomial_coefficient_nCr {
    static  int mod=1000000007;
    static int nCr(int n, int r)
    {

        if(r==0) return 1;
        if(r>n) return 0;
       return findans(n,r);
    }
    static int findans(int n,int r)
    {
      /*  int dp[][]=new int[n+1][r+1];
       // for(int i=0;i<=n;i++) dp[i][0]=1;
       for(int i=1;i<=n;i++)
       {
           for(int j=0;j<=r;j++)
           {
               if(j==0 || i==j) dp[i][j]=1;
             else dp[i][j]=((dp[i-1][j]%mod)+(dp[i-1][j-1]%mod))%mod;
           }
       }
       return dp[n][r];*/ //time->O(n*r) and space->O(n*r);
       if(r>(n-r)) r=n-r; //; 5c4==5c1-> when r>(n-r) ans->ncr==nc(n-r)
       int dp[]=new int[r+1];
       dp[0]=1;//0th col value in pascal's triangle
       //n-> row number of Pascal's triangle and r its column
       for(int i=1;i<=n;i++)
       {
         for(int j=Math.min(i,r);j>0;j--)//mn is used to cal values of prev rows
         dp[j]=(dp[j]+dp[j-1])%mod; //since ncr=(n-1)cr+(n-1)cr ->n is same r changing
       }
       return dp[r]; //space->O(n) and time->O(n*r)

    }
}
