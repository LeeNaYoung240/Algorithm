class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int num = numbers.length;
        for(int i=0;i<num;i++)
        {
            answer+=numbers[i];
        }
        answer/=num;
        return answer;
    }
}