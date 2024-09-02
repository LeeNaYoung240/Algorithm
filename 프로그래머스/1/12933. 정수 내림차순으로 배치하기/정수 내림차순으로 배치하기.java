import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = String.valueOf(n).split(""); // 1 1 8 3 7 2
        Long[] x = new Long[str.length];
        Arrays.sort(str); // 1 1 2 3 7 8
        int idx = 0;
        String s ="";
        for(int i=str.length-1;i>=0;i--)
            
        {
            x[idx++] = Long.parseLong(str[i]); // 8 7 3 2 1 1 
        }
       
        for(int i=0;i<str.length;i++)
        {
            s += x[i]; // 873211

        }
    
         answer=Long.parseLong(s);
        
        return answer;
        
    }
}