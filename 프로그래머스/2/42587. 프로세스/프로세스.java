import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // 우선순위 큐 - 내림차순
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<priorities.length;i++)
        {
            q.offer(priorities[i]);
        }
        
        while(!q.isEmpty())
        {
            for(int i=0;i<priorities.length;i++)
            {
                if(q.peek() == priorities[i])
                {
                    q.poll();
                    answer++;
                    
                    if(location == i)
                    {
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}