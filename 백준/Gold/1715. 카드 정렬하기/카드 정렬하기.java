
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(bf.readLine()));
        }
        int result = 0;
        while (q.size() > 1) {
            int x = q.poll();
            int y = q.poll();
            result+= x + y;
            q.add(x+y);
        }
        System.out.println(result);
    }
}
