class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int num = arr.length;
        for(int i=0;i<num;i++)
        {
            answer+=arr[i];
        }
        answer/=num;
        return answer;
    }
}