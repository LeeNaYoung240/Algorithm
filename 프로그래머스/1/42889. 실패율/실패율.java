import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] fail = new double[N];
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i=1;i<=N;i++)
        {
            double failureLate = 0; //실패율
            double failCnt = 0; // 실패한 플레이어 수
            double sucCnt = 0; // 도달한 플레이어 수
            
            for(int j=0;j<stages.length;j++)
            {
                if(stages[j]==i)
                {
                    failCnt++;
                }
                if(stages[j]>=i)
                {
                    sucCnt++;
                }
            }
            map.put(i, failCnt/sucCnt);
            if(failCnt == 0 && sucCnt == 0)
                map.put(i,0.0);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2)-> map.get(o2).compareTo(map.get(o1)));
        
        for(int i=0;i<N;i++)
        {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}