import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int PLength = p.length();
       
        for(int i=0;i<= t.length()-PLength; i++)
        {
            String subStr = t.substring(i,i+PLength);
            if(Long.parseLong(subStr)<=Long.parseLong(p))
            {
                answer++;
            }
        }
        return answer;
    }
}