public class re_Wiggle_Subsequence {
    public int wiggleMaxLength(int[] nums) {
        int len = nums.length;
        int res = 1;
        int up = 0;
        int down = 0;
        for(int i = 1;i < len;i++){
            if(nums[i] > nums[i - 1]){
                if(up == 0){
                    res++;
                }
                down = 0;
                up = 1;
            }else if(nums[i] < nums[i - 1]){
                if(down == 0){
                    res++;
                }
                up = 0;
                down = 1;
            }
        }
        return res;
    }
}
