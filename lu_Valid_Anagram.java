public class lu_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2){
            return false;
        }
        int[] hash = new int[128];
        for(int i = 0;i < len1;i++){
            hash[s.charAt(i)]++;
        }
        for(int i = 0;i < len2;i++){
            hash[t.charAt(i)]--;
        }
        for(int i = 0;i < 128;i++){
            if(hash[i] != 0){
                return false;
            }
        }
        return true;
    }
}
