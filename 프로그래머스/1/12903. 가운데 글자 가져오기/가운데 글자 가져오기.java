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
        int idx = 0;
        int idx2 = 0;
        if(cnt%2==1)
        {
            idx = ch.length/2; // 인덱스 번호 저장
            answer += ch[idx];
        }
        else{
            idx = ch.length/2;
            idx2 = ch.length/2-1;
            answer += ch[idx2];
            answer += ch[idx];
        }
        
        return answer;
    }
}