import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_num = 0;
        int y_num = 0;
        s = s.toUpperCase(); // 문자열 s를 모두 대문자로 변환
        
        String[] str = s.split(""); // PPOOOYY
        
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals("P"))
            {
                p_num++;
            }
            else if(str[i].equals("Y"))
            {
                y_num++;
            }
        }
         return (p_num == y_num ? answer : !answer);
    }
}