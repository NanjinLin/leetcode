import java.util.*;

public class re_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < len - 2;i++){
            while(i > 0 && i < len &&  nums[i] == nums[i - 1]){
                i++;
            }
            if(i == len){
                break;
            }
            if(nums[i] > 0){
                return res;
            }
            int target = -nums[i];
            int left = i + 1;
            int right = len - 1;
            while(left < right){
                if(nums[left] + nums[right] == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }else if(nums[left] + nums[right] < target){
                    left++;
                }else if(nums[left] + nums[right] > target){
                    right--;
                }
            }
        }
        return res;
    }
}
