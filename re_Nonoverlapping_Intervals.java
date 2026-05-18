import java.util.*;

public class re_Nonoverlapping_Intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int len = intervals.length;
        int res = 0;
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0],b[0]));
        int right = intervals[0][1];
        for(int i = 1;i < len;i++){
            if(intervals[i][0] < right){
                res++;
                right = Math.min(right , intervals[i][1]);
            }else {
                right = intervals[i][1];
            }
        }
        return res;
    }
}
