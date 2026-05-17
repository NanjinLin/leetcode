public class re_Jump_Game {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return true;
        }
        if(nums[0] == 0){
            return false;
        }
        int maxRight = 1;
        for(int i = 0;i <= maxRight;i++){
            for(int j = i ; j <= i + nums[i];j++){
                maxRight = Math.max(maxRight , j + nums[j]);
                if(maxRight >= len - 1){
                    return true;
                }
            }
            i = i + nums[i];
        }
        return false;
    }
    //之前的做法
    public boolean canJump2(int[] nums) {
        int len = nums.length;
        int right = 0;
        for(int i = right;i <= right + nums[right];i++){
            right = Math.max(right , i + nums[i]);
            if(right >= len - 1){
                return true;
            }
        }
        return false;
    }
}
