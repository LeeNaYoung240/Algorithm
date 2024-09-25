import java.util.*;
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int answer_Idx1 = 0, answer_Idx2 = 0;
        int n1=0, m1 =0;
      
        for(int i=1;i<=Math.min(n,m);i++)
        {
            if(n%i==0 && m%i==0)
            {
                answer_Idx1 = i; 
            }
        }
        n1 = n / answer_Idx1;
        m1 = m / answer_Idx1;
        answer_Idx2 = answer_Idx1 * n1 * m1;
    
        answer[0] = answer_Idx1;
        answer[1] = answer_Idx2; 
    
        return answer;
    }
}