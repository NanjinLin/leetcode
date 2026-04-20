public class lu_Reverse_String_II {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        for(int i = 0;i < s.length();i += k * 2){
            reverse(str , i , Math.min(i + k - 1, s.length() - 1));
        }
//        StringBuilder res = new StringBuilder();
//        for(int i = 0;i < str.length;i++){
//            res.append(str[i]);
//        }
//        return res.toString();
        //char[]转String 这样更快
        return new String(str);
    }
    //你可能觉得这个很好写 但是其实没一遍过
    //双指针法比一次循环更加稳定
    public void reverse(char[] str, int start, int end){
        while(start < end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}
