import java.util.*;


public class re_Maximum_Sum_Of_Array_After_K_Negations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int len = nums.length;
        int neSum = 0;
        int sum = 0;
        int minAbs = 100000;
        for(int i = 0;i < len;i++){
            if(nums[i] < 0){
                neSum++;
            }
            if(Math.abs(nums[i]) < minAbs){
                minAbs = Math.abs(nums[i]);
            }
            sum += nums[i];
        }
        Arrays.sort(nums);
        if(k <= neSum){
            for(int i = 0;i < k;i++){
                sum += 2 * nums[i] * -1;
            }
        }else {
            k -= neSum;
            for(int i = 0;i < neSum;i++){
                sum += 2 * nums[i] * -1;
            }
            if(k % 2 == 1){
                sum -= minAbs * 2;
            }
        }
        return sum;
    }
}
