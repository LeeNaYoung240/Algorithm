import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<Character> list = new ArrayList<>();
        for(char ch = 'a';ch<='z';ch++)
        {
            if(!skip.contains(String.valueOf(ch)))
            {
                list.add(ch);
            }
        }
        
        for(char c : s.toCharArray())
        {
            int curIdx = list.indexOf(c); // list의 현재 문자 c의 위치를 찾음
            int newIdx = (curIdx+index) % list.size();
            
            answer+= list.get(newIdx);
        }
        return answer;
    }
}