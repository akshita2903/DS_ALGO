package strings;
public class longestcommonsubsequence {
      public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        return lcs(text1,text2,n,m);
        
    }
    int lcs(String s,String y,int n,int m)
    {
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
            dp[i][0]=0;
        for(int i=0;i<=m;i++)
            dp[0][i]=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
    
}
//time->O(n*m)
//space->O(n*m) ->for dp matrix of size n x m