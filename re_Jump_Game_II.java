public class re_Jump_Game_II {
    public int jump(int[] nums) {
        int len = nums.length;
        int res = 0;
        int end = 0; //当前覆盖的最远距离
        int temp = 0; //下一步覆盖的最远距离
        for(int i = 0;i <= end && end < len - 1;i++){
            temp = Math.max(temp , i + nums[i]);
            if(i == end){
                end = temp;
                res++;
            }
        }
        return res;
    }
}
