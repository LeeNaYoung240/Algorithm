class Solution {
    public int solution(String s) {
        int answer = 0;
        int sameCnt = 0, diffCnt = 0;
        char x = s.charAt(0);
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== x)
            {
                sameCnt++;
            }
            else{
                diffCnt++;   
            }
            
            if(sameCnt == diffCnt)
            {
                answer++;
                sameCnt = 0;
                diffCnt = 0;
                if(i+1 <s.length())
                {
                    x = s.charAt(i+1);
                }
            } 
        }
        if(sameCnt!=0 || diffCnt !=0)
        {
            answer++;
        }
        
        return answer;
    }
}