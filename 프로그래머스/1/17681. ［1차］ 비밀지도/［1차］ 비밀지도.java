import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
       
        for(int i=0;i<n;i++)
        {
            String st = Integer.toBinaryString(arr1[i] | arr2[i]);
            st = String.format("%" + n + "s", st).replace(' ', '0');
            answer[i] = st.replace('1','#').replace('0',' ');
        }
    
        return answer;
    }
}