import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0; // 총 대기시간의 합을 저장
        int time = 0; // 현재 시간
        int idx = 0; // 현재 처리 중인 작업의 인덱스
        int len = jobs.length; // 작업의 개수
        
        Arrays.sort(jobs, (o1,o2) -> (o1[0]-o2[0])); // 요청 시간을 기준으로 오름차순 정렬
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2)-> o1[1]-o2[1]); // 소요 시간이 짧은 작업부터 처리 
        
        while(!pq.isEmpty() || idx < len) // 큐가 비어있지 않거나 처리해야 할 작업이 남아 있을 때까지
        {
            while(idx < len && jobs[idx][0] <= time) // 현재 시간보다 요청 시간이 작거나 같은 작업을 우선순위 큐에 추가
            {
                pq.offer(jobs[idx++]); // 작업을 큐에 넣고 idx 1 증가
            } 
            if(pq.isEmpty()) // 큐가 비었다면 다음 작업이 요청된 시점으로 시간 이동
            {
                time = jobs[idx][0];
            }
            else{
                int[] job = pq.poll();
                time += job[1];
                answer += time - job[0];
            }
        }
            
        return answer / len;
    }
}