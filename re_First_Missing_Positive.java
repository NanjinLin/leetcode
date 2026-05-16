public class re_First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        int[] pigeon = new int[len + 2];
        for(int i = 0;i < len;i++){
            if(nums[i] >= 0 && nums[i] <= len + 1){
                pigeon[nums[i]]++;
            }
        }
        for(int i = 1;i <= len + 1;i++){
            if(pigeon[i] == 0){
                return i;
            }
        }
        return 0;
    }
}
