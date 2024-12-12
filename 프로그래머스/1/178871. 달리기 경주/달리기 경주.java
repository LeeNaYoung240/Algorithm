import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<players.length;i++)
        {
            map.put(players[i], i); // 이름, 순위
        }
        
        for(String calling : callings)
        {
            int grade = map.get(calling); // 호출된 이름의 현재 순위
            
            String forwardCalling = players[grade-1]; // 해당 순위 직전의 players 이름을 가져옴
            
            players[grade-1] = calling; // 호출한 플레이어를 앞으로 이동
            map.put(calling, grade -1); // map에서 순위 한칸 앞으로 이동
            
            players[grade] = forwardCalling; // 앞에 있던 플레이어 뒤로 이동
            map.put(forwardCalling, grade); //map에서 순위 업데이트
        }
        return players;
    }
}