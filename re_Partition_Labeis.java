import java.util.*;

public class re_Partition_Labeis {
    public List<Integer> partitionLabels(String s) {
        int[] hash = new int[128];
        char[] str = s.toCharArray();
        int len = str.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < len;i++){
            hash[str[i]] = i;
        }
        int right = 0;
        int left = 0;
        for(int i = 0;i < len;i++){
            right = Math.max(right , hash[str[i]]);
            if(i == right){
                int temp = right - left + 1;
                left = right + 1;
                res.add(temp);
            }
        }
        return res;
    }
}
