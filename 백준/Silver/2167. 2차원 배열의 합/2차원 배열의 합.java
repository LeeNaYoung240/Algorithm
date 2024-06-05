import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][M + 1];
        int[][] psum = new int[N+1][M+1];

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j=0;j<M;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=1;i<=N;i++) {
            for(int j=1;j<=M;j++) {
                psum[i][j] = psum[i-1][j] + psum[i][j-1] - psum[i-1][j-1] + arr[i-1][j-1];
            }
        }

        st = new StringTokenizer(bf.readLine());
        int K = Integer.parseInt(st.nextToken());
        for(int t=0;t<K;t++) {
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(psum[x][y] - psum[i-1][y] - psum[x][j-1] + psum[i-1][j-1]);

        }
    }
}
