import java.util.*;
class Solution {
    public long solution(long n) {
      
        String s = String.valueOf(n); // 정수를 문자열로 변환
        char[] ch = s.toCharArray(); // 문자열을 문자 배열로 변환
        Arrays.sort(ch); // 오름차순 1 1 2 3 7 8
        StringBuilder sb = new StringBuilder(new String(ch)).reverse(); // 내림차순
        
        return Long.parseLong(sb.toString());
    }
}