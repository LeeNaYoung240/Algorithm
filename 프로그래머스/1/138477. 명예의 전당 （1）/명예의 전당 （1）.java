import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> li = new ArrayList<>();
        
        for(int i=0;i<score.length;i++)
        {
            li.add(score[i]);
            if(li.size()>k)
            {
                li.remove(Collections.min(li));
            }
            answer[i] = Collections.min(li);
        }
        return answer;
    }
}