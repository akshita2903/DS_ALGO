package dp;
class count_palindromic_subsquence{
/**Recursive approach
int cps(String s,int i,int j) //cps("ababab",0,n-1)
if(i>j) return 0;
if(i==j) return 1;
if(getc(s,i)==getc(s,j))
return 1+cps(s,i+1,j)+cps(s,i,j-1);
return cps(s,i+1,j)+cps(s,i,j-1)-cps(s,i+1,j-1)
 */
    //dp
    long countPS(String s)
    {
      long mod=1000000000L+7L;
      int n=s.length(); long res=0L;
      long[][] dp=new long[n][n];
      for(int i=0;i<n;i++)
      {
          dp[i][i]=1L;
         
      }
      for(int len=2;len<=n;len++){
          for(int i=0;i<=n-len;i++)
          {
              int j=i+len-1;
              if(getc(s,i)==getc(s,j))
              {
                  dp[i][j]=dp[i+1][j]%mod+dp[i][j-1]%mod+1L;
                  
                  
              }
              else dp[i][j]=(dp[i+1][j]%mod)+(dp[i][j-1]%mod)-(dp[i+1][j-1]%mod);
              dp[i][j]=dp[i][j]%mod;
              if(dp[i][j]<0) dp[i][j]+=mod;
          }
      }
      return dp[0][n-1]%mod;
    }
    char getc(String x,int i){
        return x.charAt(i);
    }
}