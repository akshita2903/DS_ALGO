import java.util.*;
class Palindromic_Partitoning{
   static int[][] dp=new int[501][501];
    
    static int palindromicPartition(String str)
    {
        // code here
     
        for(int i=0;i<=str.length();i++)
        {
            for(int j=0;j<=str.length();j++)
            dp[i][j]=-1;
        }
        return pp(str,0,str.length()-1);
    }
    static int pp(String s,int i,int j){
        if(i>=j){
            return 0;
        }
        if(ispal(s,i,j))
        {
         //   dp[i][j]=0;
            return dp[i][j]=0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        int real=Integer.MAX_VALUE,tmp;
        for(int k=i;k<=j-1;k++){
             tmp=1+pp(s,i,k)+pp(s,k+1,j);
            real=Math.min(real,tmp);
        }
       // dp[i][j]=real;
        return dp[i][j]=real;
        
    }

static boolean ispal(String S,int i,int j){
    
    while(i<j)
    {
        if(getc(S,i)!=getc(S,j))
        return false;
        i++;
        j--;
    }
    return true;
}
static char getc(String s,int i){
    return s.charAt(i);
}
}
