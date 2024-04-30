class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] s = String.valueOf(x).split(""); //10
        int num = s.length;
        int[] s_Int = new int[num];
        int sum = 0;
        for(int i=0;i<num;i++)
        {
            s_Int[i] = Integer.parseInt(s[i]);
        }
        for(int i=0;i<num;i++)
        {   
            sum+=s_Int[i];
        }
        if(x%sum==0)
        {
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}