public class lu_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        int len1 = ransomNote.length();
        int len2 = magazine.length();
        for(int i = 0;i < len1;i++){
            ransom[ransomNote.charAt(i) - 'a']++;
        }
        for(int i = 0;i < len2;i++){
            if(ransom[magazine.charAt(i) - 'a'] != 0){
                ransom[magazine.charAt(i) - 'a']--;
            }
        }
        for(int i = 0;i < 26;i++){
            if(ransom[i] != 0){
                return false;
            }
        }
        return true;
    }
}
