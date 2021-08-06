package dp;

public class count_subset {
    public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    return counted(arr,n,sum);
	} 
	int counted(int a[],int n,int sum)
	{
	    int dp[][]=new int[n+1][sum+1];
	    int mod=1000000007;
	     for(int i=0;i<=n;i++){
          for(int j=0;j<=sum;j++){
              if(i==0 ) dp[i][j]=0; //for empty array
              if(j==0) dp[i][j]=1; //sum==0
              if(i>0 && j>0){
               if(a[i-1]<=j)
              dp[i][j]=(dp[i-1][j]%mod)+(dp[i-1][j-a[i-1]]%mod); //either take or not take
              else dp[i][j]=dp[i-1][j]%mod;//can not take
              }
          }
      }
      return dp[n][sum]%mod;
	} 
}
