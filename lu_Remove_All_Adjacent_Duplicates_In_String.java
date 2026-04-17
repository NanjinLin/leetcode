import java.util.Stack;

public class lu_Remove_All_Adjacent_Duplicates_In_String {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] strs =  s.toCharArray();
        for(char c : strs){
            if(stack.size() == 0){
                stack.push(c);
                continue;
            }
            if(stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        //关键        stack转String
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
