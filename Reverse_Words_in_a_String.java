//一遍过

public class Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        s = s.strip();
        String[] strs = s.split("\\s+");
        int len = strs.length;
//        int left = 0;
//        int right = len - 1;
//        while(left < right){
//            String str = strs[left];
//            strs[left] = strs[right];
//            strs[right] = str;
//            left++;
//            right--;
//        }
        StringBuilder sb = new StringBuilder();
        for(int i = len - 1;i >= 0;i--){
            sb.append(strs[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
