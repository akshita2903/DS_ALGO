package dp;
import java.util.*;
public class EggDropping {
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int egg=sc.nextInt();
    int floor=sc.nextInt();
    int attempts=eggDrop(egg,floor);
    System.out.println("Critical/Threshold floor can be found in"+attempts+"attempts");
  }  
  static int eggDrop(int egg, int floor) 
  {
     // if(floor==0 || floor==1) //for any number of eggs if floor is zero or one attempt
     // //needed is floor only
     // {
     //     return floor;
     // }
     // if(egg==1){
     //     return floor; //for worst case
     // }
     // int ans=Integer.MAX_VALUE;
     // for(int k=1;k<=floor;k++){
     //     int temp_ans=1+Math.max(eggDrop(egg-1,k-1),eggDrop(egg,floor-k));
     //     ans=Math.min(ans,temp_ans);
     // }
     // return ans;
      int[][] dp=new int[egg+1][floor+1];
      int ans=solve(egg,floor,dp);
      return ans;
  }
  static int solve(int e,int f,int[][] dp){
      for(int i=1;i<=e;i++){
          dp[i][0]=0;
          dp[i][1]=1;
      }
      for(int i=1;i<=f;i++){
          dp[1][i]=i;
      }
     // int ans=Integer.MAX_VALUE;
      for(int i=2;i<=e;i++){
          for(int j=2;j<=f;j++){
             dp[i][j]=Integer.MAX_VALUE;
              for(int k=1;k<=j;k++){
                 dp[i][j]=Math.min(dp[i][j],1+Math.max(dp[i-1][k-1],dp[i][j-k])); 
              }
              //ans=Math.min(ans,dp[i][j]);
          }
      }
      return dp[e][f];
      }
}
