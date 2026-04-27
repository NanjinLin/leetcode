import java.util.Arrays;
//一个可以提高效率的方法：不需要每次让right = left + 1然后清空hash 只需要让此时的left
//对应的hash=0就可以了（注释部分）


public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0){
            return 0;
        }
        if(len == 1){
            return 1;
        }
        int[] hash = new int[128];
        int left = 0;
        int right = 1;
        hash[s.charAt(left)]++;
        int res = 1;
        while(right < len){
            if(hash[s.charAt(right)] != 0){
                res = Math.max(res , right - left);
                hash[s.charAt(left)] = 0;
                left++;
//                right = left + 1;
//                Arrays.fill(hash , 0);
//                hash[s.charAt(left)]++;
            }else {
                hash[s.charAt(right)]++;
                right++;
            }
        }
        res = Math.max(res , right - left);
        return res;
    }
}
