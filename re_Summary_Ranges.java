import java.util.*;

public class re_Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 1;
        List<String> res = new ArrayList<>();
        while(right <= len){
            StringBuilder sb = new StringBuilder();
            sb.append(nums[left]);
            while(right < len && nums[right] == nums[left] + right - left){
                right++;
            }
            if(right != left + 1){
                sb.append("->");
                sb.append(nums[right - 1]);
            }
            res.add(sb.toString());
            left = right;
            right++;
        }
        return res;
    }
//    public static void main(String[] args){
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("\"");
//        System.out.println(sb2.toString());
//        return;
//    }
}
