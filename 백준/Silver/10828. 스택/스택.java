import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int N = Integer.parseInt(bf.readLine()); //테스트 케이스 입력
        Stack<Integer> stack = new Stack<>(); //스택 선언 및 생성
        StringTokenizer st;
        for(int i = 0; i < N; i++) { //테스트 케이스 개수만큼 반복
            st = new StringTokenizer(bf.readLine());
            String s = st.nextToken(); //사용자로부터 문자열 한 줄 입력 받음
            if(s.equals("push")) //입력하는 문자열이 push일 때
            {
                int x = Integer.parseInt(st.nextToken()); //숫자 입력 받음
                stack.push(x); //스택에 push 저장
            }
            else if(s.equals("pop")) //입력하는 문자열이 pop일 때
            {
                if(stack.isEmpty()) //스택이 비어있을 경우
                {
                    System.out.println(-1); //-1출력
                }
                else{ //스택에 값이 있을 경우
                    System.out.println(stack.pop()); //가장 위의 정수를 빼서 출력
                }
            }
            else if(s.equals("size")) //입력하는 문자열이 size일 경우
            {
                System.out.println(stack.size()); //stack에 들어있는 정수의 개수 출력
            }
            else if(s.equals("empty")) //입력하는 문자열이 empty일 경우
            {
                if(stack.isEmpty()) //스택이 비어있다면
                {
                    System.out.println(1); //1 출력
                }
                else{ //스택에 값이 있다면
                    System.out.println(0); //0 출력
                }
            }
            else if(s.equals("top")) //입력하는 문자열이 top일 경우
            {
                if(!stack.isEmpty()) { //스택이 값이 있다면
                    System.out.println(stack.peek()); //스택의 가장 위에 있는 정수 출력
                }
                else{  //스택이 비어있을 경우
                    System.out.println(-1); //-1 출력
                }
            }
        }
    }
}