import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class lu_4Sum {
    //此题的temp要开long
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i < len;i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1;j < len;j++){
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int left = j + 1;
                int right = len - 1;
                while(left < right){
                    long temp = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if(temp == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        while (right > left && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        while (right > left && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        right--;
                        left++;
                    }else if(temp < target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
