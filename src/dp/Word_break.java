import java.util.*;
class Word_break{
    public static int wordBreak(String s, ArrayList<String> B )
    {
        int[] dp=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                String y=s.substring(j,i+1);
                //f sbstrng from j to i is presnt
                //means substring from j to i can be divided into parts
                if(B.contains(y))
                {
                    //stores ->in how many ways particula substr(j,i+1) can be divided
                    dp[i]+=j>0?dp[j-1]:1;
                }
            }
        }
        //if whole string can be divided mean sif dp[n-1]>0 return true
        return dp[s.length()-1]>0?1:0;
    }
}