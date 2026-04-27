public class Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int len = nums.length;
        int[] max = new int[len + 1];
        int[] min = new int[len + 1];
        max[0] = 1;
        min[0] = 1;
        int res = -114514;
        for(int i = 0;i < len;i++){
            if(nums[i] >= 0){
                max[i + 1] = Math.max(max[i] * nums[i] , nums[i]);
                min[i + 1] = Math.min(min[i] * nums[i] , nums[i]);
            }else {
                max[i + 1] = Math.max(min[i] * nums[i] , nums[i]);
                min[i + 1] = Math.min(max[i] * nums[i] , nums[i]);
            }
            res = Math.max(res , max[i + 1]);
        }
        return res;
    }
}
