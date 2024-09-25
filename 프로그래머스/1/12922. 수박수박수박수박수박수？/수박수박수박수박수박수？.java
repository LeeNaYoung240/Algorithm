import java.util.*;
class Solution {
    public String solution(int n) {
        String answer = "";
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            if(i%2 == 0)
            {
                s[i] = "수";
            }
            else 
            {
                s[i] = "박";   
            }
             answer += s[i];
        } 
        return answer;
    }
}