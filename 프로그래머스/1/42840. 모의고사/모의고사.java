import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;
        
        for(int i=0;i<answers.length;i++){
            if(answers[i] == num1[i%num1.length])
            {
                cnt1++;
            }
            if(answers[i] == num2[i%num2.length])
            {
                cnt2++;
            }
            if(answers[i] == num3[i%num3.length])
            {
                cnt3++;
            }
        }
       
        int maxScore = Math.max(cnt1, Math.max(cnt2,cnt3));
        ArrayList<Integer> list = new ArrayList<>();
        if(cnt1 == maxScore)
        {
            list.add(1);
        }
        if(cnt2 == maxScore)
        {
            list.add(2);
        }
        if(cnt3 == maxScore)
        {
            list.add(3);
        }
      
        answer = new int[list.size()];
        
        for(int i=0;i<list.size();i++)
        {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}