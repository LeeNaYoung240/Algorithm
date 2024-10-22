import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i=score.length-1;i>=0;i-=m)
        {
            if(i-m+1>=0)  // 3-4+1
            {
                answer+=score[i-m+1]*m; //그 범위에서 가장 작은 값
            }
        }
        
        return answer;
    }
}