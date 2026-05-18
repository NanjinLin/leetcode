//本题要注意：
//1.排序函数 会发生溢出情况 应该使用Integer.compare()避免减法溢出
//2.没有更新right 真实情况是新的元素的右端点会比right小
//3.因为对left排序 所以不必设置left

import java.util.*;

public class re_Minimum_Number_of_Arrows_to_Burst_Ballonns {
    public static int findMinArrowShots(int[][] points) {
        int len = points.length;
        int res = len;
        Arrays.sort(points , (a , b) -> Integer.compare(a[0] , b[0]));
//        for(int i = 0;i < len;i++){
//            System.out.println(points[i][0]);
//        }
        //int left = points[0][0];
        int right = points[0][1];
//        System.out.println(right);
        for(int i = 1;i < len;i++){
            if(points[i][0] <= right){
                //left = points[i][0];
                res--;
                right = Math.min(right , points[i][1]);
            }else {
                //left = points[i][0];
                right = points[i][1];
            }
        }
        return res;
    }
//    public static void main(String[] args){
//        int[][] test = new int[2][2];
//        test[0][0] = -2147483646;
//        test[0][1] = -2147483645;
//        test[1][0] = 2147483646;
//        test[1][1] = 2147483647;
//        int[][] test2 = {{10,16} , {2,8} , {1,6} , {7,12}};
//        int ans = findMinArrowShots(test);
//        int ans2 = findMinArrowShots(test2);
//    }
}
