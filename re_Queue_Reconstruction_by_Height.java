//本题非常非常重要 涉及二维数组多条件排序
//以及队列转成数组
import java.util.*;

public class re_Queue_Reconstruction_by_Height {
    public int[][] reconstructQueue(int[][] people) {
        int len = people.length;
        Arrays.sort(people , (a , b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        List<int[]> que = new ArrayList<>();
        for(int[] p : people){
            que.add(p[1],p);
        }
        return que.toArray(new int[0][]);
    }
}
