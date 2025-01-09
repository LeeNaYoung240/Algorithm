import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
      
        int[] fir = {1,2,3,4,5};
        int[] sec = {2,1,2,3,2,4,2,5};
        int[] thi = {3,3,1,1,2,2,4,4,5,5};
        int fir_cnt = 0, sec_cnt = 0, thi_cnt = 0;
    
        for(int i=0;i<answers.length;i++)
        {
            if(fir[i % fir.length] == answers[i])
            {
                fir_cnt++;
            }
            if(sec[i % sec.length] == answers[i])
            {
                sec_cnt++;
            }
            if(thi[i % thi.length] == answers[i])
            {
                thi_cnt++;
            }
        }
        
        int max = Math.max(fir_cnt, Math.max(sec_cnt, thi_cnt));
        
        ArrayList<Integer> list = new ArrayList<>();
        
        if(fir_cnt == max) list.add(1);
        if(sec_cnt == max) list.add(2);
        if(thi_cnt == max) list.add(3);
        
        int[] answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}