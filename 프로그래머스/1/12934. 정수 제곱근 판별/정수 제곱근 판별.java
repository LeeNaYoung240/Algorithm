import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n); // 제곱근 구하기
        long x = (long)sqrt; // 소수점 버리고 타입 변환
        if(x*x == n)
        {
            answer = (x+1)*(x+1);
        }
        else
        {
            answer = -1;
        }
        
        return answer;
    }
}