package dp;
class LP_substring{
     public String longestPalindrome(String s) {
      //brute force->generate all substring of s and check for each subsring if its a palindrome or not
        //optimized approach---
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++) dp[i][i]=1;
        int start=0,maxlen=1,end=0;
        for(int i=0;i<n-1;i++){
            if(getc(s,i)==getc(s,i+1))
            {
                dp[i][i+1]=1;
                start=i;
                end=i+1;
                maxlen=2;
            }
        }
        
        //maximum possible len of plaindromic substring
        for(int possible_len=3;possible_len<=n;possible_len++)
        {
            for(int i=0;i<=n-possible_len;i++){
                int j=i+possible_len-1;//end index of substring with of length=possible_len starting with index i
    if(dp[i+1][j-1]==1 && getc(s,i)==getc(s,j)){
        dp[i][j]=1;
        start=i;
        end=j;
        maxlen=possible_len;
    }
            }
        }
        return s.substring(start,end+1);
    }
    char getc(String x,int index){
        return x.charAt(index);
    }
}