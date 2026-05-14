public class re_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 0;
        while(right < len){
            right = left;
            while(left < len && nums[left] != 0){
                left++;
                right++;
            }
            while(right < len && nums[right] == 0){
                right++;
            }
            if(right == len){
                break;
            }
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
    }
}
