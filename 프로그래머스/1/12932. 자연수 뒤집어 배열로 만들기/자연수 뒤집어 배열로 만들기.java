import java.util.*;
class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n); 
        String[] str = s.split(""); // 1 2 3 4 5
        int[] answer = new int[str.length];
        int idx = 0;
        for(int i=str.length-1;i>=0;i--)
        {
            answer[idx++] = Integer.parseInt(str[i]); // 뒤집어서 저장
        }
        
        return answer;
    }
}