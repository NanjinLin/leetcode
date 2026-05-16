public class re_Product_of_Array_Except_Self {
    //更加优化空间的做法：省掉right数组 把右缀乘到res数组里
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] right = new int[len];
        right[len - 1] = 1;
        for(int i = len - 2;i >= 0;i--){
            right[i] = right[i + 1] * nums[i + 1];
        }
        int pre = 1;
        int[] res = new int[len];
        for(int i = 0;i < len;i++){
            res[i] = pre * right[i];
            pre *= nums[i];
        }
        return res;
    }
}
