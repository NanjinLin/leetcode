import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class lu_Top_K_Frequent_Elements {
    //方法一 HashMap
    //非常重要的知识是对map根据value排序：先转换为set 再转换为list 再排序
    //map和set都不能排序
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[k];
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else {
                map.put(num,map.get(num) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        for(int i = 0;i < k;i++){
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}
