class lu_Target_Sum{
    public int findTargetSumWays(int[] nums, int target){
        int sum = 0;
        int len = nums.length;
        for(int num : nums){
            sum += num;
        }
        int target2 = (sum + target) / 2;
        if(Math.abs(target) > sum){
            return 0;
        }
        if((target + sum) % 2 == 1){
            return 0;
        }
        int[] dp = new int[target2 + 1];
        dp[0] = 1;
        for(int i = 0;i < len;i++){
            for(int j = target2;j >= nums[i];j--){
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[target2];
    }
}
