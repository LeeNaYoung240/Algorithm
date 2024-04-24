import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        Stack<Integer> stack = new Stack<>(); //스택 선언 및 생성
        int K = Integer.parseInt(bf.readLine()); //테스트 케이스 입력
        int sum = 0;
        for(int i = 0; i < K; i++) {
            int n = Integer.parseInt(bf.readLine()); //테스크 케이스 수만큼 입력받음
            stack.push(n); //입력받은 수를 stack에 저장
            if(n==0) //0이 입력될 때
            {
                stack.pop(); //pop, 2번을 한 이유는 0도 빼주어야되기 때문
                stack.pop();
            }
        }
        while(!stack.isEmpty()) { //스택이 빌 때까지
            sum += stack.pop(); //pop 하는데 sum에 값을 저장
        }
        System.out.println(sum);
    }
}