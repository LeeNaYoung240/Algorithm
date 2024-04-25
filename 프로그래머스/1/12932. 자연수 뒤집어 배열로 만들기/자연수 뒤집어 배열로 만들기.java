class Solution {
    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        //1 2 3 4 5 
        int num = str.length;
        int[] answer = new int[num];
        int[] x = new int[num];
        for(int i=0;i<num;i++)
        {
            x[i] = Integer.parseInt(str[i]); 
        }
        int idx = 0;
        for(int i=num-1;i>=0;i--)
        {
            answer[idx++] = x[i];
        }
        return answer;
    }
}