import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d); // 오름차순
        int sum = 0, cnt = 0;
        for(int i=0;i<d.length;i++)
        {
            if((sum+=d[i])<=budget)
            {
                cnt++;
            }
        }
        return cnt;
    }
}