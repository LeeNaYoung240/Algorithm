class Solution {
    public int solution(int num) {
        int cnt = 0;
        int answer = 0;
        while(num!=1)
        {
        
            if(num%2 == 0)
            {
                num = num/2;
            }
            else if(num%2 == 1)
            {
                num = num*3 + 1;
            }
            cnt++;
            if(cnt>=500)
            {
                return -1;
            }
         }
        return cnt;
    }
}