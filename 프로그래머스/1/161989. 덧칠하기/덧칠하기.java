class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int start = section[0];
        answer++;
        
        for(int item : section) // 2 3 6
        {
            if(start+m > item) // 2+4 = 6 > 2, 6>6
            {
                continue;
            }
            start = item;
            answer++;
        }
        return answer;
    }
}