class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a)
        {
            int cola = n/a; // 교환할 수 있는 콜라 수
            answer += cola * b; // 교환해서 받는 콜라 수
            n = (n%a) + (cola *b); // 남은 빈병 + 새로 생긴 빈 병
        }
        
        return answer;
    }
}