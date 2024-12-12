import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<players.length;i++)
        {
            map.put(players[i],i);
        }
        for(String s : callings)
        {
            int grade = map.get(s); // 호출된 플레이어 등수
            
            String forwardCalling = players[grade-1]; // 호출한 플레이어 직전의 사람
            players[grade-1] = s; // 호출한 사람 해당 자리로 업데이트
            map.put(s, grade-1); //map에 순위 한칸 앞으로 이동
            
            players[grade] = forwardCalling; // 앞에 있던 사람 등수 뒤로 이동
            map.put(forwardCalling, grade);
        }
        
        return players;
    }
}