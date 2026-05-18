//比较考验细节的一道题
//标答用字符数组做的 思路一致

import java.util.*;

public class re_Monotone_Increasing_Digits {
    public int monotoneIncreasingDigits(int n) {
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.addFirst(n % 10);
            n /= 10;
        }
        int len = list.size();
        int vit = len;
        for(int i = 1;i < len;i++){
            if(list.get(i) < list.get(i - 1)){
                vit = i - 1;
                break;
            }
        }
        while(vit != len && vit >= 1 && list.get(vit).equals( list.get(vit - 1))){
            vit -= 1;
        }
        int res = 0;
        int cnt = len - 1;
        for(int i = 0;i < vit;i++){
            res += Math.pow(10 , cnt) * list.get(i);
            cnt--;
        }
        if(vit != len) {
            res += (list.get(vit) - 1) * Math.pow(10, cnt);
            cnt--;
        }
        for(int i = vit + 1;i < len;i++){
            res += Math.pow(10 , cnt) * 9;
            cnt--;
        }
        return res;
    }
}
