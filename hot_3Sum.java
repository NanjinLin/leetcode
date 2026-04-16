import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class hot_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        //双指针使用前一定要排序
        Arrays.sort(nums);
        for(int i = 0;i < len - 2;i++){
            if(nums[i] > 0){
                return res;
            }
            //去重 很重要
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int target = 0 - nums[i];
            int left = i + 1;
            int right = len - 1;
            while(left < right){
                //找到第一个三元组之后也要记得去重 因为可能会存在其他的两个数满足相加为target
                if(nums[left] + nums[right] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    while(right > left && nums[right] == nums[right - 1]){
                        right--;
                    }
                    while(right > left && nums[left] == nums[left + 1]){
                        left++;
                    }
                    right--;
                    left++;
                }
                else if(nums[left] + nums[right] < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}
