public class lu_Combination_Sum_IV {
    public int combinationSum4(int[] nums, int target) {
        int len = nums.length;
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for(int j = 0;j <= target;j++){
            for(int i = 0;i < len;i++){
                if(j >= nums[i]) {
                    dp[j] = dp[j] + dp[j - nums[i]];
                }
            }
        }
        return dp[target];
    }
}
