import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        while(n>0)
        {
            sum+=n%10;
            int mok = n/10;
            n = mok;
        }
        
        return sum;
    }
}