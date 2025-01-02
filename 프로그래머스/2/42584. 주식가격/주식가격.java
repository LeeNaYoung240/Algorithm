import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i : prices)
        {
            q.add(i);
        }
        int idx = 0;
        
        while(!q.isEmpty()) 
        {
            int currentPrice = q.poll(); // 첫번째 가격을 꺼냄
            for(int x : q) // 큐에 남아있는 가격들을 차례대로 확인
            {
                answer[idx]++; // 더 낮은 가격을 찾기 전까지 증가
                if(currentPrice > x) break;
            }
            idx++; // 다음 인덱스로
        }
        
        return answer;
    }
}