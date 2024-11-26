import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> li = new ArrayList<>();
        
        for(int i=0;i<ingredient.length;i++)
        {
            li.add(ingredient[i]);
            
            if(li.size()>=4 &&
               li.get(li.size()-4) == 1 &&
               li.get(li.size()-3) == 2 &&
               li.get(li.size()-2) == 3 &&
               li.get(li.size()-1) == 1 )
            {
                answer++;
                for(int j=0;j<4;j++)
                {
                    li.remove(li.size()-1);
                }
            }
        }
        
        return answer;
    }
}