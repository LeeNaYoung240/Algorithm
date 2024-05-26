import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] grid;
    static boolean[] visited;
    static int R, C;
    static String s;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        grid = new int[R+1][C+1];
        visited = new boolean[26];
        for(int i = 0; i < R; i++) {
            s = bf.readLine();
            for(int j = 0; j < C; j++) {
                grid[i][j] = s.charAt(j) - 'A';
            }
        }
        dfs(0,0,1);
        System.out.println(max);
    }
    public static void dfs(int x, int y, int cnt) {
        visited[grid[x][y]] = true;
        max = Math.max(max,cnt);
        for(int i=0;i<4;i++)
        {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < R && ny >= 0 && ny < C && !visited[grid[nx][ny]])
            {
                dfs(nx,ny,cnt+1);
                visited[grid[nx][ny]] = false;
            }
        }
    }
}
