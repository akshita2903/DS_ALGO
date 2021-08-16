package dp;
class LCS_Of_3_string{
    int lcsofstring(String x,String y,String z,int n1,int n2,int n3){
        int res=LCS(x,y,z,n1,n2,n3);
        return res;
    }

    //---------------------------O(n*n*n) time and O(n*n*n) space----------------------------------------
      int LCS(String x,String y,String z,int n1,int n2,int n3){
        int dp[][][]=new int[n1+1][n2+1][n3+1];
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++)
            {
                for(int k=0;k<=n3;k++){
                    if(i==0 || j==0||k==0) dp[i][j][k]=0;
                    else{
                        char xc=getc(x,i-1);
                        char yc=getc(y,j-1);
                        char zc=getc(z,k-1);
                        if(xc==yc && yc==zc)
                        dp[i][j][k]=1+dp[i-1][j-1][k-1];
                        else
                        {
   int max1=max(dp[i-1][j][k],max(dp[i-1][j-1][k],dp[i-1][j][k-1]));
   int max2=max(dp[i][j-1][k],dp[i][j-1][k-1]);
   int max3=dp[i][j][k-1];
   dp[i][j][k]=max(max1,max(max2,max3));
                        }
                    }
                }
            }
        }
        return dp[n1][n2][n3];
    }
    char getc(String x,int i)
    {
        return x.charAt(i);
    }
    int max(int a,int b){
        return (a>=b)?a:b;
    }

}