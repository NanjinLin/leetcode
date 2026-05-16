import java.util.*;

public class re_Sliding_Window_Maximum {
    //通过
    //其实不用对第一个窗口做初始化 直接从0到len - 1进行for循环就行
    //当i大于k - 1的时候开始往res里加
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if(k >= len){
            int ans = 0;
            for(int i = 0;i < len;i++){
                ans = Math.max(ans , nums[i]);
            }
            int[] fans = {ans};
            return fans;
        }
        int[] res = new int[len - k + 1];
        Deque<Integer> que = new LinkedList<>();
        que.offer(0);
        for(int i = 1;i < k;i++){
            while(!que.isEmpty() && nums[que.peekLast()] <= nums[i]){
                que.pollLast();
            }
            que.offerLast(i);
        }
        res[0] = nums[que.peekFirst()];
        int ptr = 1;
        for(int i = k;i < len;i++){
            while(!que.isEmpty() && que.peekFirst() <= i - k){
                que.pollFirst();
            }
            while(!que.isEmpty() && nums[que.peekLast()] <= nums[i]){
                que.pollLast();
            }
            que.offer(i);
            res[ptr++] = nums[que.peekFirst()];
        }
        return res;
    }
}
