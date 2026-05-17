import java.util.*;

public class re_Roman_to_Integer {
    public int romanToInt(String s) {
        Deque<Character> que = new LinkedList<>();
        char[] str = s.toCharArray();
        int len = str.length;
        int res = 0;
        for(int i = 0;i < len;i++){
            if(str[i] == 'I'){
                que.offer('I');
            }else if(str[i] == 'V'){
                if(!que.isEmpty() && que.peekLast() == 'I'){
                    que.pollLast();
                    res += 4;
                }else {
                    res += 5;
                }
            }else if(str[i] == 'X'){
                if(!que.isEmpty() && que.peekLast() == 'I'){
                    que.pollLast();
                    res += 9;
                }else {
                    que.offer('X');
                }
            }else if(str[i] == 'L'){
                if(!que.isEmpty() && que.peekLast() == 'X'){
                    que.pollLast();
                    res += 40;
                }else {
                    res += 50;
                }
            }else if(str[i] == 'C'){
                if(!que.isEmpty() && que.peekLast() == 'X'){
                    que.pollLast();
                    res += 90;
                }else {
                    que.offer('C');
                }
            }else if(str[i] == 'D'){
                if(!que.isEmpty() && que.peekLast() == 'C'){
                    que.pollLast();
                    res += 400;
                }else {
                    res += 500;
                }
            }else if(str[i] == 'M'){
                if(!que.isEmpty() && que.peekLast() == 'C'){
                    que.pollLast();
                    res += 900;
                }else {
                    res += 1000;
                }
            }
        }
        if(que.isEmpty()){
            return res;
        }else {
            int lenq = que.size();
            System.out.println(lenq);
            for(int i = 0;i < lenq;i++){
                if(!que.isEmpty() && que.peekFirst() == 'I'){
                    res += 1;
                    que.pollFirst();
                }else if(!que.isEmpty() && que.peekFirst() == 'X'){
                    res += 10;
                    que.pollFirst();
                }else if(!que.isEmpty() && que.peekFirst() == 'C'){
                    res += 100;
                    que.pollFirst();
                }
            }
            return res;
        }
    }
}
