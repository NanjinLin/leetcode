import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class IntersectionOfTwoArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int count = 0;
		if(contains(nums2 , nums1[0])){
			count++;
		}else {
			nums1[0] = -114514;
		}
		for(int i = 1;i < nums1.length;i++){
			if(contains(nums2 , nums1[i]) && nums1[i] != nums1[i - 1]){
				count++;
			}else {
				nums1[i] = -114514;
			}
		}
		int[] res = new int[count];
		int k = 0;
		for(int i = 0;i < nums1.length;i++){
			if(nums1[i] != -114514){
				res[k++] = nums1[i];
			}
		}
		return res;
	}
	public static boolean contains(int[] nums,int num){
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == num){
				return true;
			}
		}
		return false;
	}

	//最优解 用Set
	public static int[] intersection2(int[] nums1, int[] nums2) {
		// 定义两个Set，自动去重
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> intersectionSet = new HashSet<>();

		// 把nums1所有元素加入set1（自动去重）
		for (int num : nums1) {
			set1.add(num);
		}

		// 遍历nums2，存在set1中的就是交集
		for (int num : nums2) {
			if (set1.contains(num)) {
				intersectionSet.add(num);
			}
		}

		// Set转数组返回
		int[] res = new int[intersectionSet.size()];
		int i = 0;
		for (int num : intersectionSet) {
			res[i++] = num;
		}
		return res;
	}
}
