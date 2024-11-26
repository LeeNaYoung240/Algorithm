import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] cntX = new int[10];
        int[] cntY = new int[10];
        
        for(char ch : X.toCharArray())
        {
            cntX[ch-'0']++; // 문자 -> 숫자, ch가 '3' 일 때, cntX[3]이 1 증가
        }
        for(char ch : Y.toCharArray())
        {
            cntY[ch-'0']++;
        }
        
        for(int i=9;i>=0;i--)
        {
            int cnt = Math.min(cntX[i],cntY[i]);
            for(int j=0;j<cnt;j++)
            {
                answer.append(i);
            }
        }
        if(answer.length()==0)
        {
            return "-1";
        }
        if(answer.charAt(0) == '0')
        {
            return "0";
        }
        
        return answer.toString();
    }
}