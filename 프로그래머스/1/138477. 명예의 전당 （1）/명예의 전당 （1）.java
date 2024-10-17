import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //우선순위 큐 선언
        
        for(int i=0;i<score.length;i++)
        {
            pq.add(score[i]); //pq에 요소 저장
            
            if(pq.size()>k) //pq의 크기가 k보다 크면
            {
                pq.poll(); //가장 작은 값 제거
            }
            
            answer[i] = pq.peek(); // 가장 작은 값 조회
        }
        
        
        return answer;
    }
}