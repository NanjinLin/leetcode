import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class lu_Sliding_Window_Maximum {

    //时间超限
    public int[] maxSlidingWindow2(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int max = -114514;
        int[] res = new int[nums.length - k + 1];
        for(int i = 0;i < k;i++){
            queue.offer(nums[i]);
            if(nums[i] > max) max = nums[i];
        }
        res[0] = max;
        for(int i = k; i < nums.length; i++){
            int temp = queue.peek();
            if(temp == max && temp < nums[i]){
                max = -114514;
                queue.poll();
                for(int el : queue){
                    max = Math.max(max, el);
                }
            }else {
                queue.poll();
            }
            queue.offer(nums[i]);
            max = Math.max(max, nums[i]);
            res[i - k + 1] = max;
        }
        return res;
    }

    ///解法二 双端队列
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;
        for(int i = 0; i < n; i++) {
            // 1. 移除超出窗口左边界的队首元素
            while(!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }
            // 2. 维护单调递减队列，移除队尾比当前元素小的元素
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            // 窗口形成后，记录队首元素为当前窗口最大值
            if(i >= k - 1) {
                res[idx++] = nums[deque.peek()];
            }
        }
        return res;
    }
}
