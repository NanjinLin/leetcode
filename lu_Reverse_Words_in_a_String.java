public class lu_Reverse_Words_in_a_String {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        int left = 0;
        int right = str.length - 1;
        while(left < right){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < str.length;i++){
            res.append(str[i]);
            if(i != str.length - 1){
                res.append(" ");
            }
        }
        return res.toString();
    }
}
