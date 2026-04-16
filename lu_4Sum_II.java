import java.util.HashMap;
import java.util.Map;

public class lu_4Sum_II {
    //把四个数组分成两组 分别算和 在哈希表里查找
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int len = nums1.length;
        Map<Integer,Integer> hash = new HashMap<>();
        int ans = 0;
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                int sum = nums1[i] + nums2[j];
                hash.put(sum , hash.getOrDefault(sum,0) + 1);
            }
        }
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                ans += hash.getOrDefault(0 - nums3[i] - nums4[j],0);
            }
        }
        return ans;
    }
}
