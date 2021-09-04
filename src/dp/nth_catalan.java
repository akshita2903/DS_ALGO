package dp;
import java.util.*;
import java.math.BigInteger;
public class nth_catalan {
    public static BigInteger findCatalan(int n)
    {
       //Your code here
       BigInteger dp[]=new BigInteger[n+1];
       nthCat(dp,n+1);
       return dp[n];
        
    }
   static void nthCat(BigInteger dp[],int n){
      dp[0]=BigInteger.ONE;
      
        for(int i=1;i<n;i++){
            dp[i]=BigInteger.ZERO;
            for(int j=0;j<i;j++)
            dp[i]=dp[i].add((dp[j].multiply(dp[i-j-1])));
        }
    }
    
}
