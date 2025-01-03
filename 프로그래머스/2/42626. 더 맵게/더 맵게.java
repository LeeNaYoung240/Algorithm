import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int scovilles : scoville)
        {
            pq.offer(scovilles);
        }
        
        while(pq.size() > 1 && pq.peek() < K)
        {
            int fir = pq.poll();
            int sec = pq.poll();
            int total = fir + (sec * 2);
            pq.add(total);
            answer++;
        }
        
        if(pq.peek() < K && pq.size() <= 1)
        {
            return -1;
        }
        
        return answer;
    }
}