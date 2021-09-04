package dp;
class matrix_chain_multi{
    static   int[][] dp=new int[101][101];
      
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        for(int[] x:dp) Arrays.fill(x,-1);
      return  MCM(arr,1,arr.length-1);
       
        //return dp[arr.length][arr.length];
    }
    
   static int MCM(int[] a,int i,int j){
        if(i>=j) return 0;
       if(dp[i][j]!=-1) return dp[i][j];
       dp[i][j]=Integer.MAX_VALUE;
       for(int k=i;k<=j-1;k++){
           int temp=MCM(a,i,k)+MCM(a,k+1,j)+a[i-1]*a[k]*a[j];
           dp[i][j]=min(dp[i][j],temp);
       }
       return dp[i][j];
    }
   static int min(int a,int b){
        return a<=b?a:b;
    }
}