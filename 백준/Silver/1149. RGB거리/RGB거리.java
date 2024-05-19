
import java.util.*;
import java.io.*;

public class Main {
    final static int r=0;
    final static int g=1;
    final static int b=2;

    static int[][] cost;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(bf.readLine());
        cost = new int[N][3];
        dp = new int[N][3];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            cost[i][r] = Integer.parseInt(st.nextToken());
            cost[i][g] = Integer.parseInt(st.nextToken());
            cost[i][b] = Integer.parseInt(st.nextToken());
        }
        dp[0][r] = cost[0][r];
        dp[0][g] = cost[0][g];
        dp[0][b] = cost[0][b];

        System.out.println(Math.min(result_cost(N-1,r),Math.min(result_cost(N-1,g),result_cost(N-1,b))));
    }
    static int result_cost(int N, int color) {
        if(dp[N][color] == 0) {
            if(color == r)
            {
                dp[N][r] = Math.min(result_cost(N-1,g),result_cost(N-1,b))+cost[N][r];
            }
            else if(color == g)
            {
                dp[N][g] = Math.min(result_cost(N-1,b),result_cost(N-1,r))+cost[N][g];
            }
            else if(color == b)
            {
                dp[N][b] = Math.min(result_cost(N-1,r),result_cost(N-1,g))+cost[N][b];
            }
        }
        return dp[N][color];
    }
}
