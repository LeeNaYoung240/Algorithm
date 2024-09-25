import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int idx = 0;
        int m1=0, m2 =0;
        int result = 0;
        
        for(int i=1;i<=Math.min(n,m);i++)
        {
            if(n%i==0 && m%i==0)
            {
                idx = i; // 최대공약수
            }
          
        }
        m1 = n / idx;
        m2 = m / idx;
        result = idx * m1 * m2;
    
        answer[0] = idx;
        answer[1] = result; 
    
        return answer;
    }
}