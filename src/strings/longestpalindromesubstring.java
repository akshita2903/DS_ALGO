class longestpalindromesubstring {
    public String longestPalindrome(String s) {
        int l=s.length();
        int dp[][]=new int[l][l]; //dp[start][end];
        int start=0,end=0;
       for(int i=0;i<l;i++) dp[i][i]=1; //dioagonal
        
       for(int i=l-2;i>-1;i--) //start
       {
           for(int j=i+1;j<l;j++) //end
           {
               if(s.charAt(i)==s.charAt(j))
               {
                 if((dp[i+1][j-1]==1) ||(j-i)==1)
                     dp[i][j]=1;
                   
                   else dp[i][j]=0;
               }
               if(dp[i][j]==1)
               {
                   if((j-i)>(end-start))
                   {
                       start=i;
                       end=j;
                   }
               }
           }
       }
        return s.substring(start,end+1);
      
        
    }
}
