class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        boolean check = true;
        StringBuilder sb = new StringBuilder();
        
        for(char c : s.toCharArray())
        {
            if(c ==' ')
            {
                check = true;
            }
            else if(check)
            {
                // 단어의 첫 글자를 대문자로 변환
                c = Character.toUpperCase(c);
                // 다음 글자는 더 이상 단어의 첫글자가 아님
                check = false;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}