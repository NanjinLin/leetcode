import java.util.Deque;
import java.util.LinkedList;

class MinStack {
    //利用一个辅助栈 辅助栈的元素数量与主栈相同 代表截至目前主栈的最小值 每次push和pop与主栈同步
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStack() {
        stack = new LinkedList();
        minStack = new LinkedList();
        //初始化一个最大值 用于第一次push
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        //永远只存最小值
        minStack.push(Math.min(val, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        //与主栈同步pop 剩下的第一个值依然是主栈中的最小值
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}