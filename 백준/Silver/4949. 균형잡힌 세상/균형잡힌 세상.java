import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            Stack<String> stack = new Stack<>();
            String s = bf.readLine();
            String[] arr = s.split("");
            if (s.equals("."))
                break;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("(") || arr[i].equals("[")) {
                    stack.push(arr[i]);
                } else if (arr[i].equals(")")) {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.push(arr[i]); // 쌍을 이루지 않는 괄호일 경우 스택에 넣음
                        break;
                    }
                } else if (arr[i].equals("]")) {
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                        break;
                    }
                }
            }
            if(stack.isEmpty())
            {
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

    }
}