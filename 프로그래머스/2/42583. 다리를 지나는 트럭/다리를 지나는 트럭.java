import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0;i<bridge_length-1;i++)
        {
            q.add(0);
        }
        
        int current_w = truck_weights[0];
        q.add(current_w);
        
        int answer = 1;
        int idx = 1;
        
        while(!q.isEmpty())
        {
            answer++;
            
            int removed = (int) q.poll();
            current_w -= removed;
            
            if(idx < truck_weights.length)
            {
                if(current_w + truck_weights[idx] <= weight)
                {
                    current_w += truck_weights[idx];
                    q.add(truck_weights[idx]);
                    idx++;
                }
                else{
                    q.add(0);
                }
            }
            
        }
        
        return answer;
    }
}