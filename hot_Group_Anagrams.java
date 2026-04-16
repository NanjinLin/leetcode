import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class hot_Group_Anagrams {
    //暴力法
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        List<List<String>> res = new ArrayList<>();

        for(int i = 0;i < len;i++){
            if(strs[i].equals("1")){
                continue;
            }
            int len1 = strs[i].length();
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for(int j = i + 1;j < len;j++){
                int len2 = strs[j].length();
                if(len1 != len2){
                    continue;
                }else {
                    int[] temp = new int[128];
                    for(int m = 0;m < len1;m++){
                        temp[strs[i].charAt(m)]++;
                    }
                    for(int k = 0;k < len2;k++){
                        temp[strs[j].charAt(k)]--;
                    }
                    int flag = 1;
                    for(int k = 0;k < 128;k++){
                        if(temp[k] != 0){
                            flag = 0;
                            break;
                        }
                    }
                    if(flag == 1){
                        list.add(strs[j]);
                        strs[j] = "1";
                    }
                }
            }
            res.add(list);
        }
        return res;
    }

    //Hash分组法    豆包提供
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. 字符串转字符数组
            char[] ch = s.toCharArray();

            // 2. 排序 → 变成唯一key
            Arrays.sort(ch);
            //字符数组转字符串
            String key = new String(ch);

            // 3. 不存在就新建列表
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // 4. 加入当前组
            map.get(key).add(s);
        }

        // 5. 返回所有分组
        //map.values()    map.keySet()      取出所有的value/key
        return new ArrayList<>(map.values());
    }
}
