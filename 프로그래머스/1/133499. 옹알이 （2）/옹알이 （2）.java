class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String b:babbling)
        {
            String modified = b;
            
            String[] words = {"aya", "ye", "woo","ma"};
            
            if (b.contains("ayaaya") || b.contains("yeye") || b.contains("woowoo") || b.contains("mama")) {
                continue;
            }
            
            for(String word : words)
            {
                modified = modified.replace(word," ");
            }
            if(modified.trim().isEmpty())
            {
                answer++;
            }
        }
        return answer;
    }
}