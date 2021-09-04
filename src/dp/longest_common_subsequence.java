package dp;

public class longest_common_subsequence {
     //Function to find the length of longest common subsequence in two strings.
     static int lcs(int x, int y, String s1, String s2)
     {
     return LCS(x,y,s1,s2);
     }
    static int LCS(int a,int b,String x,String y){
         int dp[][]=new int[a+1][b+1]; //space->O(a*b)
         for(int i=0;i<=a;i++){
             for(int j=0;j<=b;j++){
                 if(i==0 || j==0) dp[i][j]=0; //for string of len==0
                 else if(x.charAt(i-1)==y.charAt(j-1))
                     dp[i][j]=1+dp[i-1][j-1];
                 else
                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
             }
         }
         return dp[a][b];
     }
    
}
//time->O(a*b) for two forloops and space->O(a*b) for dp array
