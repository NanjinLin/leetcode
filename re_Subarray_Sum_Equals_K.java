import java.util.*;

public class re_Subarray_Sum_Equals_K {
    //滑动窗口无法解决这道题 因为涉及负数
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        int sum = 0;
        int res = 0;
        Deque<Integer> que = new LinkedList<>();
        for(int i = 0;i < len;i++){
            que.offer(nums[i]);
            sum += nums[i];
            while(sum > k){
                int num = que.pollFirst();
                sum -= num;
            }
            if(!que.isEmpty() && sum == k){
                res++;
            }
        }
        return res;
    }
    //正确解法：前缀和
    public int subarraySum2(int[] nums, int k) {
        int len = nums.length;
        int count = 0;
        int pre = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , 1);
        for(int i = 0;i < len;i++){
            pre += nums[i];
            if(map.containsKey(pre - k)){
                count++;
            }
            map.put(pre , map.getOrDefault(pre , 0) + 1);
        }
        return count;
    }
}
