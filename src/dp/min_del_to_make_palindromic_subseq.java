package dp;
class min_del_to_make_palindromic_subseq{
     static int minimumNumberOfDeletions(String S) {
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
    return n-dp[n][n];
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