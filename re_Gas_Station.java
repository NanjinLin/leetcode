//自己做出来了但是很艰难


public class re_Gas_Station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int sumGas = 0;
        int sumCost = 0;
        int start = 0;
        for(int i = 0;i < len;i++){
            sumGas += gas[i];
            sumCost += cost[i];
            gas[i] -= cost[i];
        }
        if(sumGas < sumCost){
            return -1;
        }
        //-2 -2 -2 3 3
        //1 -3 1 -2 3
        int test = 0;
        for(int i = 0;i < len;i++){
            test += gas[i];
            if(test < 0){
                start = i + 1;
                test = 0;
            }
        }
        return start;
    }
}
