import java.util.*;
class Solution {
    public int[] solution(String s) {
        String[] str =  s.split(""); // b a n a n a
        int[] answer = new int[str.length];
        answer[0] = -1;
        for(int i=1;i<str.length;i++)
        {
            answer[i] = -1; //기본값
            for(int j=i-1;j>=0;j--)
            {
               if(str[i].equals(str[j]))
               {
                   answer[i] = i-j;
                   break;
               }
            }
        }
        return answer;
    }
}