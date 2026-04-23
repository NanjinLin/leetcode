public class lu_Ones_and_Zeroes {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][]dp = new int[m + 1][n + 1];
        int len = strs.length;
        for(int i = 0;i < len;i++){
            int one = countOne(strs[i]);
            int zero = countZero(strs[i]);
            for(int j = m;j >= zero;j--){
                for(int k = n;k >= one;k--){
                    dp[j][k] = Math.max(dp[j][k] , dp[j - zero][k - one] + 1);
                }
            }
        }
        return dp[m][n];
    }
    public int countOne(String str){
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public int countZero(String str){
        int count = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == '0'){
                count++;
            }
        }
        return count;
    }
}
