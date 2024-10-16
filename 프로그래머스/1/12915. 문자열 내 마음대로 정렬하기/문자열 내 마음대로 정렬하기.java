import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<strings.length;i++)
        {
            arr.add(""+strings[i].charAt(n)+strings[i]);
        }
        Collections.sort(arr); //첫번째 문자 기준으로 정렬
        answer = new String[arr.size()];
        
        for(int i=0;i<arr.size();i++)
        {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        } // usun -> sun
        return answer;
    }
}