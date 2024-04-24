import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int N = Integer.parseInt(bf.readLine()); // 막대기 개수 입력 받음
        Stack<Integer> stack = new Stack<>(); //스택 선언 후 생성
        for(int i=0;i<N;i++)
        {
            stack.add(Integer.parseInt(bf.readLine())); //스택에 추가
        }
        int stick = stack.pop(); // 6
        int container;
        int cnt = 1; //오른쪽에서 무조건 하나 이상은 보이니 1로 시작
        while(!stack.isEmpty()) //스택이 빌 떄까지
        {
            container = stack.pop(); //4 6 7 9 6
            if(container > stick) //7 9
            {
                stick = container;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}