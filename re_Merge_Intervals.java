//本题需要注意：在循环外将最后一组加入到list

import java.util.*;

public class re_Merge_Intervals {
    public static int[][] merge(int[][] intervals) {
        int len = intervals.length;
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
        int left = intervals[0][0];
        int right = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for(int i = 1;i < len;i++){
            if(intervals[i][0] <= right){
                right = Math.max(intervals[i][1] , right);
            }else {
                int[] arr = {left , right};
                list.add(arr);
                left = intervals[i][0];
                right = intervals[i][1];
            }
            //System.out.println(right);
        }
        int[] arr = {left , right};
        list.add(arr);
        int len2 = list.size();
        int[][] res = new int[len2][2];
        for(int i = 0;i < len2;i++){
            //System.out.println(list.get(i)[0]);
            res[i] = list.get(i);
        }
        return res;
    }
//    public static void main(String[] args){
//        int[][] intervals = {{1,3} , {2,6} , {8,10} , {15,18}};
//        int[][] test = merge(intervals);
//    }
}
