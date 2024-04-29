import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str); //오름차순
        String x = "";
        for(int i=str.length-1;i>=0;i--)
        {
            x += str[i];
        }
        answer = Long.parseLong(x);
        return answer;
    }
}