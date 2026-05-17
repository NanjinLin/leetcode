public class re_Candy {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candy = new int[len];
        for(int i = 0;i < len;i++){
            candy[i] = 1;
        }
        int res = len;
        for(int i = 0;i < len - 1;i++){
            if(ratings[i] < ratings[i + 1]){
                res += candy[i] - candy[i + 1] + 1;
                candy[i + 1] = candy[i] + 1;
            }
        }
        for(int i = len - 1;i > 0;i--){
            if(ratings[i] < ratings[i - 1] && candy[i] >= candy[i - 1]){
                    res += candy[i] - candy[i - 1] + 1;
                    candy[i - 1] = candy[i] + 1;
            }
        }
        return res;
    }
}
