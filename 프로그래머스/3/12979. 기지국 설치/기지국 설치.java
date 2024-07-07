class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0, stations_idx = 0, i = 1;
        
        while(i<=n)
        {
            if(stations_idx < stations.length && i >= stations[stations_idx]-w)
            {
                i = stations[stations_idx] + w + 1;
                stations_idx++;
                continue;
            }
            i += 2 * w + 1;
            answer++;
        }
    
   
        return answer;
    }
}