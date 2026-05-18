public class re_Lemonade_Change {
    public boolean lemonadeChange(int[] bills) {
        int len = bills.length;
        int[] store = new int[2];
        for(int i = 0;i < len;i++){
            if(bills[i] == 5){
                store[0]++;
            }else if(bills[i] == 10){
                if(store[0] > 0){
                    store[0]--;
                    store[1]++;
                }else {
                    return false;
                }
            }else if(bills[i] == 20){
                if(store[1] > 0){
                    if(store[0] == 0){
                        return false;
                    }else {
                        store[1]--;
                        store[0]--;
                    }
                }else {
                    if(store[0] < 3){
                        return false;
                    }else {
                        store[0] -= 3;
                    }
                }
            }
        }
        return true;
    }
}
