import java.util.*;
class Solution {
    public String solution(String s) {
        String answer1 = "";
        char[] str = s.toCharArray();
        Arrays.sort(str);
        for(int i=str.length-1;i>=0;i--)
        {
            answer1 += str[i];
        }
        
        return answer1;
    }
}