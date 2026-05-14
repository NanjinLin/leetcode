public class re_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len - 1;
        int res = Math.min(height[left] , height[right]) * (right - left);
        while(left < right){
            if(height[left] <= height[right]){
                left++;
            }else {
                right--;
            }
            res = Math.max(res , Math.min(height[left] , height[right]) * (right - left));
        }
        return res;
    }
}
