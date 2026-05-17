import java.util.*;

public class re_Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        int leng = g.length;
        int lens = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int k = 0;
        for(int i = 0;i < lens;i++){
            for(int j = k;j < leng;j++){
                if(g[j] <= s[i]){
                    res++;
                    k = j + 1;
                    break;
                }
            }
        }
        return res;
    }
}
