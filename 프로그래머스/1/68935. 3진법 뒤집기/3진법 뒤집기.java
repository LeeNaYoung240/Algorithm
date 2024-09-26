import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n, 3); // 10진수 -> 3진법
        String str = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            str += s.charAt(i);
        }
        answer = Integer.parseInt(str, 3); // str을 3진법으로 해석해서 10진법으로 변환
        return answer;
    }
}