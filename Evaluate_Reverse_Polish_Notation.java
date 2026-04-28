import java.util.Deque;
import java.util.LinkedList;

public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        Deque<Integer> deque = new LinkedList<>();
        for(int i = 0;i < len;i++){
            if(tokens[i].equals("+")){
                deque.push(deque.pop() + deque.pop());
            }else if(tokens[i].equals("-")){
                int jianshu = deque.pop();
                int beijianshu = deque.pop();
                deque.push(beijianshu - jianshu);
            }else if(tokens[i].equals("*")){
                deque.push(deque.pop() * deque.pop());
            }else if(tokens[i].equals("/")){
                int chushu = deque.pop();
                int beichushu = deque.pop();
                deque.push(beichushu / chushu);
            }else {
                deque.push(Integer.parseInt(tokens[i]));
            }
        }
        return deque.pop();
    }
}
