class unbounded_orange_knapsack
{
  	public int minimumCost(int cost[], int N,int W)
	{
		// Your code goes here
		int packet[]=new int[N];
	
		return cost(cost,N,W);
	}
	int cost(int c[],int n,int w){
	    int dp[][]=new int[n+1][w+1];
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=w;j++){
	            if(i==0) dp[i][j]=Integer.MAX_VALUE;
	            if(j==0) dp[i][j]=0;
	            if(i>0 && j>0){
	                if(i<=j && c[i-1]!=-1 && dp[i][j-i]!=Integer.MAX_VALUE)
	                dp[i][j]=min(dp[i-1][j],c[i-1]+dp[i][j-i]);
	                else 
	                dp[i][j]=dp[i-1][j];
	            }
	            
	        }
	    }
	    return dp[n][w]==Integer.MAX_VALUE?-1:dp[n][w];
	}
	int min(int a,int b)
	{
	    return a<=b?a:b;
	}
}
