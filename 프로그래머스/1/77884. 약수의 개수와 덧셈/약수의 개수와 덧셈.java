class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left;i<=right;i++)
        {
            int cnt = 0;
            for(int j=1;j<=right;j++)
            {
                if(i%j==0)
                {
                    cnt++;
                }
            }
            if(cnt%2==0)
            {
                answer+=i;
            }
            else if(cnt%2 ==1)
            {
                answer-=i;
            }
        }
        return answer;
    }
}