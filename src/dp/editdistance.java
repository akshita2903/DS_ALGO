package dp;

public class editdistance {
    public int editDistance(String s, String t) {
        return findcost(s,t);
    }
    private int findcost(String a,String b)
    {
        if(a.equals(b)) return 0;
        int a1=a.length(),b1=b.length();
        int dp[][]=new int[a1+1][b1+1];
        for(int i=0;i<=a1;i++) dp[i][0]=i;
        for(int i=0;i<=b1;i++) dp[0][i]=i;
        for(int i=1;i<=a1;i++)
        {
            for(int j=1;j<=b1;j++)
            {
                int insert_cost=dp[i][j-1];
                int replace_cost=dp[i-1][j-1];
                int remove_cost=dp[i-1][j];
               if(a.charAt(i-1)!=b.charAt(j-1))
               dp[i][j]=1+Math.min(insert_cost,Math.min(replace_cost,remove_cost));
               else dp[i][j]=dp[i-1][j-1];
            }
        }
        return dp[a1][b1];

    }

}
//time->O(s.lenght()*t.length()))
//space->O(s.length()*t.length())) for dp table
