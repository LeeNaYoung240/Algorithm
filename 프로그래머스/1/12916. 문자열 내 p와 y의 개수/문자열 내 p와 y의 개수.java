import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_num = 0;
        int y_num = 0;
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='p')
           {
               p_num++;
           }
            else if(s.charAt(i)=='y')
            {
                y_num++;
            }
            
        }
        
        if(p_num != y_num)
            {
                answer = false;
            }
        
        
        return answer;
    }
}