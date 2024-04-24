import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int N = Integer.parseInt(bf.readLine()); // 테스트 케이스
        Stack<String> stack = new Stack<>(); //스택 선언
        for (int i = 0; i < N; i++) {  
            String str = bf.readLine(); //문자열을 입력 받음
            String[] arr = str.split(" "); //입력 받은 문자열을 공백을 기준으로 배열에 저장
            for(int j = 0; j < arr.length; j++) { //
                stack.push(arr[j]); //stack에 저장
            }
            System.out.print("Case #"+(i+1)+": ");
            for(int j = 0; j < arr.length; j++) {
                while(!stack.isEmpty()){ //스택이 빌 때까지
                    System.out.print(stack.pop()+" "); //pop을 통해 마지막부터 꺼내줌
                    if(stack.isEmpty()){ //첫번째 결과가 출력되고 이후 입력을 개행하고 받기 위해
                        System.out.println(); 
                    }
                }
            }
        }

    }
}