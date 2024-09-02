import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<=n;i++)
        {
            if(n%i==1)
            {
                answer = i;
                
                if(answer < min)
                {
                    min = answer;
                }
            }     
        }
        return min;
    }
}