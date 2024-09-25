import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray(); // 문자열을 문자 배열로
        int cnt = 0;
        for(int i=0;i<ch.length;i++)
        {
            cnt++;
        }
        int idx1 = 0, idx2 = 0;
        if(cnt%2==1)
        {
            idx1 = ch.length / 2; 
            answer += ch[idx1];
        }
        else{
            idx1 = ch.length / 2 - 1;
            idx2 = ch.length / 2;
            answer += ch[idx1];
            answer += ch[idx2];
        }
        return answer;
    }
}