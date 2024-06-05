import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());

        int sumValue = 0;
        int[] psum = new int[N+1]; //누적합

        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<N;i++) {
           sumValue += Integer.parseInt(st.nextToken());
           psum[i+1] = sumValue;

        }


        st = new StringTokenizer(bf.readLine());
        int m = Integer.parseInt(st.nextToken());
        // (x, y)까지의 부분 배열의 합
        for(int i=0;i<m;i++) {
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(psum[y]-psum[x-1]);

        }
    }
}
