import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int allDate = 0;
        for(int i=0;i<a-1;i++)
        {
            allDate += date[i];
        }
        allDate += (b-1); // 1월 1일을 기준으로 0일이 금요일로 시작
        answer = day[allDate % 7];
        return answer;
    }
}   
// a = 5, b = 24
// allDate = 31 + 29 + 31 + 30 = 121
// allDate = 121 + 23 = 144
// 144 % 7 = 4, day[4] = TUE