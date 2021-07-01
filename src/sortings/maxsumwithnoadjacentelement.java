package sortings;
public class maxsumwithnoadjacentelement {
    public int FindMaxSum(int arr[], int n)
    {
       int dp[]=new int[n+1];
       dp[0]=0;dp[1]=arr[0];
       for(int i=1;i<n;i++)
       dp[i+1]=Math.max(dp[i],arr[i]+dp[i-1]);
       return dp[n];

    }

}
//time->O(n) for traversing
//space->O(n) for dp array
