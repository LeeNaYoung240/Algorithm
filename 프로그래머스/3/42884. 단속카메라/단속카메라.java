import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        // 진출 지점을 기준으로 오름차순 정렬
        Arrays.sort(routes, (a,b) -> Integer.compare(a[1],b[1]));
        
        int min = Integer.MIN_VALUE;
        for(int[] route : routes)
        {
            if(min<route[0])
            {
                min = route[1];
                answer++;
            }
        }
        return answer;
    }
}