import java.util.*;

public class re_Find_All_Anagrams_in_a_String {
    //自己想的 map法
    public List<Integer> findAnagrams(String s, String p) {
        int lens = s.length();
        int lenp = p.length();
        List<Integer> res = new LinkedList<>();
        if(lens < lenp){
            return res;
        }
        int[] checkp = new int[128];
        for(int i = 0;i < lenp;i++){
            checkp[p.charAt(i)]++;
        }
        Map<Character , Integer> map = new HashMap<>();
        for(int i = 0;i < lenp;i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) + 1);
        }
        int flag = 1;
        //***
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();
            if(checkp[key] - val != 0){
                flag = -1;
                break;
            }
        }
        if(flag == 1){
            res.add(0);
        }
        for(int i = 0;i < lens - lenp;i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i) , 0) - 1);
            map.put(s.charAt(i + lenp) , map.getOrDefault(s.charAt(i + lenp) , 0) + 1);
            flag = 1;
            for(Map.Entry<Character , Integer> entry : map.entrySet()){
                char key = entry.getKey();
                int val = entry.getValue();
                if(checkp[key] - val != 0){
                    flag = -1;
                    break;
                }
            }
            if(flag == 1){
                res.add(i + 1);
            }
        }
        return res;
    }
    //标答 用array实现滑动窗口
    //***Array.equals(arr1 , arr2)
    public List<Integer> findAnagrams2(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}
