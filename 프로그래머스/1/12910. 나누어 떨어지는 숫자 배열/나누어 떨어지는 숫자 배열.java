import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        Arrays.sort(arr);
        int cnt = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%divisor == 0)
            {
               cnt++;
            }
        }
        int[] result = new int[cnt];
        int idx = 0;
        if(cnt == 0)
        {
            return answer;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%divisor == 0)
            {
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }
}