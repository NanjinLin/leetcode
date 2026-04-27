import java.util.HashSet;

public class Happy_Number {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            n = nextNumber(n);
            if(n == 1){
                return true;
            }else if(set.contains(n)){
                return false;
            }else {
                set.add(n);
            }
        }
        return true;
    }
    public int nextNumber(int n){
        int nextNumber = 0;
        while(n > 0){
            nextNumber += Math.pow(n % 10 , 2);
            n /= 10;
        }
        return nextNumber;
    }
}
