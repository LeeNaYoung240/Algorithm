import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        // 정수를 문자열로 변환
        for(int i=0;i<numbers.length;i++)
        {
            str[i] = String.valueOf(numbers[i]);
        }
        
        // o1:6, o2:10일 때 610이 큰지 106이 큰지 비교
        Arrays.sort(str, (o1,o2) -> (o2+o1).compareTo(o1+o2));
        
        // 문자열 더하기
        for(String s : str)
        {
            answer += s;
        }
      
        if(answer.charAt(0)=='0')
        {
            answer =  "0";
        }
        
        return answer;
    }
}