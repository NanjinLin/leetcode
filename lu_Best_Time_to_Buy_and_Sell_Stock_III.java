public class lu_Best_Time_to_Buy_and_Sell_Stock_III {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][4];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        dp[0][2] = -prices[0];
        dp[0][3] = 0;
        for(int i = 1;i < len;i++){
            //在状态0的时候 注意是-prices[i] 而不是dp[i - 1][1] - prices[i]
            dp[i][0] = Math.max(dp[i - 1][0] , - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] + prices[i] , dp[i - 1][1]);
            dp[i][2] = Math.max(dp[i - 1][1] - prices[i] , dp[i - 1][2]);
            dp[i][3] = Math.max(dp[i - 1][2] + prices[i] , dp[i - 1][3]);
        }
        return dp[len - 1][3];
    }
}
