class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int num = arr.length;
        double sum = 0;
        for(int i=0;i<num;i++)
        {
            sum += arr[i];
        }
        
        return (sum/num);
    }
}