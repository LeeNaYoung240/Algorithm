import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n,3); // 3진법으로 변환
        String str = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            str += s.charAt(i);
        }
        answer = Integer.parseInt(str, 3);
        
        return answer;
    }
}