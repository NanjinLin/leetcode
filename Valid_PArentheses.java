import java.util.Deque;
import java.util.LinkedList;
//第一版错误原因： 当输入不是( [ {的时候要先判断stk是不是空 不然会报错 比如只输入一个]

public class Valid_PArentheses {
    public boolean isValid(String s) {
        Deque<Character> stk = new LinkedList<>();
        int len = s. length();
        for(int i = 0;i < len;i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stk.push(s.charAt(i));
            }else if(stk.isEmpty()){
                return false;
            }else if(s.charAt(i) == ')'){
                if(stk.pop() != '('){
                    return false;
                }
            }else if(s.charAt(i) == ']'){
                if(stk.pop() != '['){
                    return false;
                }
            }else if(s.charAt(i) == '}'){
                if(stk.pop() != '{'){
                    return false;
                }
            }
        }
        if(stk.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
