import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        int T = Integer.parseInt(bf.readLine()); //테스트 케이스 입력
        Stack<String> stack = new Stack<>(); //스택 선언 및 생성
        String[] arr;
        for(int i=0;i<T;i++) {
            String s = bf.readLine();
            arr = s.split("");
            for(int j=0;j<arr.length;j++) {
                if(arr[j].equals("("))
                {
                    stack.push(arr[j]);
                }
                else{
                    if(stack.isEmpty())
                    {
                        stack.push(arr[j]);
                        break;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty())
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}