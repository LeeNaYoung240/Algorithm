import java.util.*;
class Solution {
    public int solution(int n) {
        int min = Integer.MAX_VALUE; // min을 제일 큰 값으로 초기화하기
        
        for(int i=1;i<=n;i++)
        {
            if(n%i==1)
            {
                if(min>i)
                {
                    min = i;
                }
            }
        }
        return min;
    }
}