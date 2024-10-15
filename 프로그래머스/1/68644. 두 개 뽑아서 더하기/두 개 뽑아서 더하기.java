import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> se = new HashSet<>(); // set을 사용하여 중복을 자동으로 제거
        
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                se.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] answer = new int[se.size()]; //set을 배열로 변환
        int idx = 0;
        for(int sum : se)
        {
            answer[idx++] = sum;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}