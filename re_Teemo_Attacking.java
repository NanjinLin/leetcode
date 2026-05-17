public class re_Teemo_Attacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int len = timeSeries.length;
        int res = 0;
        int left = timeSeries[0];
        int right = left + duration - 1;
        for(int i = 1;i < len;i++){
            if(timeSeries[i] <= right){
                right = timeSeries[i] + duration - 1;
            }else {
                res += right - left + 1;
                left = timeSeries[i];
                right = left + duration - 1;
            }
        }
        res += right - left + 1;
        return res;
    }
}
