package dp;
// Given a height h, count the maximum number of balanced binary trees possible with height h. Print the result modulo 109 + 7.
// Note : A balanced binary tree is one in which for every node, the difference between heights of left and right subtree is not more than 1.
//ex-n=2
//soln 1      1      1      ==>total 3
  //    2   2       2  3
class total_balanced_bt_with_height_h {
    static long countBT(int h) {
        // code here
        long mod = 1000000000L;
        mod += 7L;
        long dp[] = new long[h + 1];
        dp[0] = 1L;
        dp[1] = 1L;
        for (int i = 2; i <= h; i++) {
            //=dp[i-1]*dp[i-2]+dp[i-2]*dp[i-1]+dp[i-1]*dp[i-1]
            dp[i] = dp[i - 1] * ((2 * dp[i - 2]) % mod + dp[i - 1] % mod) % mod;
        }
        return dp[h];

    }
}