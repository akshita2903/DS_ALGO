package dp;

public class maximize_cut {
      //Function to find the maximum number of cuts.
      public int maximizeCuts(int n, int x, int y, int z)
      {
         int len=x+y+z;
       
         return maxcut(n,x,y,z);
      }
      int maxcut(int n, int x,int y,int z){
          int dp[] = new int[n + 1];
   
          for (int i = 0; i < n + 1; i++)
              dp[i] = -1;
   
        
          dp[0] = 0;
   
          for (int i = 0; i <=n; i++) {
   
            
              if (dp[i] == -1)
                  continue;
      
   
  
              if (i + x <= n)
                  dp[i + x] = max(dp[i + x], dp[i] + 1);
   
              if (i + y <= n)
                  dp[i + y] = max(dp[i + y], dp[i] + 1);
   
             
              if (i + z <= n)
                  dp[i + z] =max(dp[i + z], dp[i] + 1);
          }
   
        
          if (dp[n] == -1) {
              dp[n] = 0;
          }
         
          return dp[n];
      }
      
      int max(int a,int b){
          return (a>=b)?a:b;
      }
    
}
