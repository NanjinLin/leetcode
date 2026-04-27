import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
//这道题其实没必要用TreeSet

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int res = 0;
        for(int num : set){
            if(set.contains(num - 1)){
                continue;
            }
            int count = 1;
            while(set.contains(num + 1)){
                num++;
                count++;
            }
            res = Math.max(res , count);

        }
        return res;
    }
}
