package strings;
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int x=lcs(word1,word2);
        
         return x;
     }
     public int lcs(String a,String b)
     {
         int m=a.length(),n=b.length();
         int dp[][]=new int[m+1][n+1];
         for(int i=0;i<=m;i++) //time.c->O(m)
             dp[i][0]=i;
         for(int j=0;j<=n;j++) //time->O(n)
             dp[0][j]=j;
         for(int i=1;i<=m;i++) //O(m)
         {
             for(int j=1;j<=n;j++) //O(n)
             {
                 int insert=dp[i][j-1];
                 int delete=dp[i-1][j];
                 int replace=dp[i-1][j-1];
                if(a.charAt(i-1)==b.charAt(j-1))
                    dp[i][j]=0+dp[i-1][j-1];
                    else
                        dp[i][j]=1+Math.min(insert,Math.min(delete,replace));
             }
         } //time-complexity O(m*n)
         return dp[m][n];
     }
     //overall time complexity->max(O(m*n),O(n),O(m))==O(m*n)
     //space complexity->O(m*n) for dp table of size (m*n)
    
}
