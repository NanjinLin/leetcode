//第一遍没过：dp[0]必须是0 不然数组一直不变了

public class Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for(int i = 1;i <= amount;i++){
            dp[i] = 114514;
        }
        int len = coins.length;
        for(int i = 0;i < len;i++){
            for(int j = coins[i];j <= amount;j++){
                dp[j] = Math.min(dp[j] , dp[j - coins[i]] + 1);
            }
        }
        return dp[amount] == 114514 ? -1 : dp[amount];
    }
}
