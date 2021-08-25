package BinaryTree.src.dp;
class longest_palindrome_subsequence{
    //using LPS--------------------
      public int longestPalindromeSubseq(String s)
    {
        int n=s.length();
        int[][] dp=new int[n][n];
        //for string of length 1
        for(int i=0;i<n;i++) dp[i][i]=1;
        
        //Max possible len f palindrome subsequnec
        for(int len_of_str=2;len_of_str<=n;len_of_str++){
            //run from 0 to n-(char after i+len)
            for(int i=0;i<=n-len_of_str;i++){
                int j=i+len_of_str-1;//get last char of substring of length //len starting from ith index
                if(getc(s,i)==getc(s,j))
                    dp[i][j]=2+dp[i+1][j-1];
                else dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][n-1];
    }
    //using LCS||-------------------
  static int LPS(String S) {
        int n=S.length();
        String y=reverse(S);
    int[][] dp=new int[n+1][n+1];
    for(int i=0;i<=n;i++){
     for(int j=0;j<=n;j++){
         if(i==0 || j==0) dp[i][j]=0;
         else{
             if(getc(S,i-1)==getc(y,j-1))
             dp[i][j]=1+dp[i-1][j-1];
             else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
         }
     }   
    }
    return dp[n][n];
    }
   static String reverse(String x){
       int n=x.length(),i=0;
       String res="";
       while(i<n){
           res=Character.toString(getc(x,i))+res;
           i++;
       }
       return res;
   }
   static char getc(String y,int j){
       return y.charAt(j);
   }
} 