import java.util.*;

public class re_Longest_Substring_Without_Repeating_Characters {
    //方法一：用Deque
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Deque<Character> que = new LinkedList<>();
        int res = 0;
        for(int i = 0;i < len;i++){
            if(!que.contains(s.charAt(i))){
                que.offerLast(s.charAt(i));
            }else {
                while (que.contains(s.charAt(i))) {
                    que.pollFirst();
                }
                que.offerLast(s.charAt(i));
            }
            res = Math.max(res, que.size());
        }
        return res;
    }
    //方法二：用Set
    public int lengthOfLongestSubstring2(String s) {
        int len = s.length();
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int left = 0, right = 0; right < len;right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            res = Math.max(res , set.size());
        }
        return res;
    }
}
