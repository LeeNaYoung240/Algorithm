import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cntSame = 0, zeroNum = 0;
        int plusTotal = 0, minusTotal = 0;
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        for(int i=0;i<lottos.length;i++)
        {
            for(int j=0;j<win_nums.length;j++)
            {
                if(lottos[i]==win_nums[j])
                {
                   cntSame++;
                   System.out.println(cntSame);
                }
            }
            
            if(lottos[i]== 0)
            {
                zeroNum++;
            }
            
            answer[0] = grade(cntSame+zeroNum);
            answer[1] = grade(cntSame);
        }
        return answer;
    }
    public int grade(int n)
    {
        switch(n)
        {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
         }  
     }
}