import java.util.List;
//本题求的是排列数 要外层遍历背包内层遍历物品

public class Word_Break {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        int dictlen = wordDict.size();
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for(int i = 1;i <= len;i++){
            for(int j = 0;j < dictlen;j++){
                if(i >= wordDict.get(j).length() && dp[i - wordDict.get(j).length()] == 1 && wordDict.contains(s.substring(i - wordDict.get(j).length() , i))){
                    dp[i] = 1;
                    break;
                }
            }
        }
        if(dp[len] == 1){
            return true;
        }else {
            return false;
        }
    }
}
