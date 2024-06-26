import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<works.length;i++)
        {
            q.add(works[i]);
        }
        while(n>0)
        {
            int work = q.poll();
            if(work == 0) break;
            work -= 1;
            q.add(work);
            n -= 1;
        }
        for(int work : q)
        {
            answer += work*work;
        }
        return answer;
    }
}