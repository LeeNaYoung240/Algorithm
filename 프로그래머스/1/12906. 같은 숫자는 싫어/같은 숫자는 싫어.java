import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        List<Integer> li = new ArrayList<Integer>();
        li.add(arr[0]);
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                li.add(arr[i]);
            }
        }
        answer = new int[li.size()];
        
        for(int i=0;i<li.size();i++)
        {
            answer[i] = li.get(i);
        }
        
        return answer;
    }
}