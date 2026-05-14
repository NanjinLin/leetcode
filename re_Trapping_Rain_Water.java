public class re_Trapping_Rain_Water {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];
        int res = 0;
//        left[0] = height[0];
//        right[len - 1] = height[len - 1];
        for(int i = 1;i < len;i++){
            left[i] = Math.max(left[i - 1] , height[i - 1]);
        }
        for(int i = len - 2;i >= 0;i--){
            right[i] = Math.max(right[i + 1] , height[i + 1]);
        }
        for(int i = 1;i < len - 1;i++){
            if(height[i] < left[i] && height[i] < right[i]){
                int h = Math.min(left[i] , right[i]);
                res += h - height[i];
            }
        }
        return res;
    }
}
