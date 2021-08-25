package BinaryTree.src.dp;
class fence_painting {
    long countWays(int n, int k) {
        long mod = 1000000000L + 7L;
        long[] dp = new long[n + 1];
        long K = (long) k;
        long diff = (long) k, same = 0L;
        dp[1] = diff % mod + same % mod;

        for (int i = 2; i <= n; i++) {
            same = diff;
            diff = dp[i - 1] * (k - 1);
            dp[i] = diff % mod + same % mod;
            dp[i] = dp[i] % mod;
            if (dp[i] < 0) dp[i] += mod;
        }
        return dp[n];
    }
}