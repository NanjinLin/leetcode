public class lu_Coin_Change_II {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        int[] dp = new int [amount + 1];
        dp[0] = 1;
        for(int i = 0;i < len;i++){
            for(int j = coins[i];j <= amount;j++){
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }
        return dp[amount];
    }
}
