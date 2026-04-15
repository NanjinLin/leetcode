import java.util.List;
import java.util.ArrayList;

public class lu_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] hash = new int[1001];
        for(int i = 0;i < len1;i++){
            hash[nums1[i]]++;
        }
        for(int i = 0;i < len2;i++){
            if(hash[nums2[i]] != 0){
                ans.add(nums2[i]);
                hash[nums2[i]] = 0;
            }
        }
        int[] finalans  = new int[ans.size()];
        for(int i = 0;i < ans.size();i++){
            finalans[i] = ans.get(i);
        }
        return finalans;
    }
}
