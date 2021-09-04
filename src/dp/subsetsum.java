package dp;

public class subsetsum {
    static Boolean isSubsetSum(int N, int arr[], int sum){
        return SubsetSum(arr,N,sum);
   }
   static Boolean SubsetSum(int a[],int n,int sum){
       Boolean dp[][]=new Boolean[n+1][sum+1];

      for(int i=0;i<=n;i++){
          for(int j=0;j<=sum;j++){
              if(i==0 ) dp[i][j]=false; //for empty array
              if(j==0) dp[i][j]=true; //sum==0
              if(i>0 && j>0){
               if(a[i-1]<=j)
              dp[i][j]=dp[i-1][j]||dp[i-1][j-a[i-1]]; //either take or not take
              else dp[i][j]=dp[i-1][j];//can not take
              }
          }
      }
      return dp[n][sum];
   }
    
}
