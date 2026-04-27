import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//非常重要的一道题

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> map = new HashMap<String , List<String>>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            //错误写法：
            // String key = arr.toString();
            //正确写法：
            String key = new String(arr);
            List<String> list = map.getOrDefault(key , new ArrayList<>());
            list.add(str);
            map.put(key , list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
