import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int max_v = 0, max_h = 0;
        for(int i=0;i<sizes.length;i++)
        {
            Arrays.sort(sizes[i]); 
            // 명함의 작은 값이 먼저 오게                   
        }

        for(int i=0;i<sizes.length;i++)
        {
            if(sizes[i][0]>max_v)
            {
                max_v = sizes[i][0];
            }
            if(sizes[i][1]>max_h)
            {
                max_h = sizes[i][1];
            }
        }
        return max_v*max_h;
    }
}