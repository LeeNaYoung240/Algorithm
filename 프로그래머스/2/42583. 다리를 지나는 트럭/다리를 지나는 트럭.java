import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int size = truck_weights.length; //다리 위를 건너야 할 트럭의 수
        int current = 0; // 다리 위에 올라간 트럭 무게
        int idx = 0;
        
        Queue<Integer> q = new LinkedList<>();
        
        do{
            if(q.size() == bridge_length)
            {
                current -= q.poll(); // 다리 위에 트럭이 꽉 차면 다리를 건넌 트럭을 큐에서 제거하고 그 무게를 빼줌
            }
            if(idx<size && current + truck_weights[idx] <= weight) // 다리위에 트럭이 올라갈 수 있다면
            {
                q.add(truck_weights[idx]); // 큐에 해당 인덱스 번호의 무게를 추가
                current += truck_weights[idx++]; // 무게에 해당 무게를 추가
            }
            else
                q.add(0); // 트럭이 올라갈 수 없다면 0 추가
            
            answer++; // 시간 증가
            
        } while(current != 0); // 모든 트럭이 다리를 건널 때까지 반복
        
        
        return answer;
    }
}