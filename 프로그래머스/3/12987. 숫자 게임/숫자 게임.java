import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int A_len = A.length-1; // A 배열 마지막 인덱스 저장
        int B_len = A_len; // B 배열 마지막 인덱스 저장
        for(int i=A_len;i>=0;i--)
        {
            if(A[i]<B[B_len])
            {
                answer++;
                B_len--;
            }
        }
        return answer;
    }
}