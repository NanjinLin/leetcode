public class lu_Find_the_Index_of_the_First_Occurrence_in_a_String {
    public int strStr(String haystack, String needle) {
        for(int i = 0;i < haystack.length() - needle.length() + 1;i++){
            if(isPart(haystack, i ,needle) == true){
                return i;
            }
        }
        return -1;
    }
    public boolean isPart(String s1 , int k , String s2){
        int len = s2.length();
        int index = 0;
        for(int i =  k;i < k + len;i++){
            if(s1.charAt(i) != s2.charAt(index++)){
                return false;
            }
        }
        return true;
    }
}
