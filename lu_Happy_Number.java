import java.util.HashSet;
import java.util.Set;

public class lu_Happy_Number {
    public boolean isHappy(int n) {
        Set<Integer> hash = new HashSet<>();
        while(n != 1 && !hash.contains(n)){
            hash.add(n);
            n = nextNumber(n);
        }
        return n == 1;
    }
    private int nextNumber(int n){
        int res = 0;
        while(n > 0){
            res += (n % 10) * (n % 10);
            n /= 10;
        }
        return res;
    }
}
