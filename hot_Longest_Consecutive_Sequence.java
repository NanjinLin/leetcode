import java.util.Set;
import java.util.HashSet;

public class hot_Longest_Consecutive_Sequence {
    //没有想到要用HashSet
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int res = 0;
        for(int num : set){
            if(!set.contains(num - 1)){
                int start = num;
                int cur = 1;
                while(set.contains(start + 1)){
                    start++;
                    cur++;
                }
                res = Math.max(res, cur);
            }
        }
        return res;
    }
}
