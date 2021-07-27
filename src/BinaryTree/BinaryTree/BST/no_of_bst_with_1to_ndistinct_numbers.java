class no_of_bst_with_1to_ndistinct_numbers{
    int ans(int n){
        int dp[]=new int[n+1];
        dp[0]=1; dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                dp[i]+=dp[j-1]*dp[i-j]; //leftsubtree*rightsubtree
            }
        }
        return dp[n];
    }
}