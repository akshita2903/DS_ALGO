package BinaryTree.src.dp;
class given_score {
    public long count(int n) {
        long dp[][] = new long[4][n + 1];
        int pts[] = {3, 5, 10};
        for (int i = 0; i <= 3; i++) //array element
        {
            for (int j = 0; j <= n; j++) //weight/sum/n
            {
                if (i == 0) dp[i][j] = 0L; //empty set
                else if (j == 0) dp[i][j] = 1L; //subset with sum==0
                else if (i > 0 && j > 0) {
                    if (pts[i - 1] <= j)
                        dp[i][j] = dp[i][j - pts[i - 1]] + dp[i - 1][j]; //either take or not take
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[3][n];
    }
}