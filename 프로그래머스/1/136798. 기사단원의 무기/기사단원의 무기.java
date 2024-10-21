class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] cnt = new int[number+1];
        for(int i=1;i<=number;i++)
        {
           for(int j=1;j*j<=i;j++)
           {
               if(i%j==0)
               {
                   cnt[i]++;
                   if(j!=i/j)
                   {
                       cnt[i]++;
                   }
               }
           }
            if(cnt[i]<=limit)
           {
               answer+=cnt[i];
           }
           else if(cnt[i]>limit)
           {
               answer+=power;
            }
        }
        return answer;
    }
}