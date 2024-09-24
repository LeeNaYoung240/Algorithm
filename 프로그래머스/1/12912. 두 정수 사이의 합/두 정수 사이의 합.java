class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        for(int i=a;i<=b;i++)
        {
            if(a==b)
            {
                answer = a;
            }
            else{
                 answer +=i;
            }
          
        }
        for(int i=b;i<=a;i++)
        {
             if(a==b)
            {
                answer = a;
            }
            else{
                 answer +=i;
            }
        }
        return answer;
    }
}