import java.util.*;
import java.io.*;

public class Main {
    static int[][] grid; //맵
    static boolean[][] visited; //방문 여부
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int cnt = 0; //안전 영역 개수 저장
    static int answer =0; // 최종적으로 가장 많은 안전 영역 개수 저장
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());

        grid = new int[n][n];
        int max = 0;
        for(int i = 0;i<n;i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0;j<n;j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                max = Math.max(max, grid[i][j]); // 맵의 최대 높이 계산
            }
        }
        for(int k=0;k<=max;k++)
        {
            visited = new boolean[n][n];
            cnt = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(grid[i][j]> k && !visited[i][j])
                    {
                        dfs(i,j,k);
                        cnt++;
                    }
                }
            }
            answer = Math.max(answer,cnt);
        }
        System.out.println(answer);
    }
    public static void dfs(int x,int y,int h)
    {
        visited[x][y] = true;
        for(int i=0;i<4;i++)
        {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<n && ny<n && !visited[nx][ny] && grid[nx][ny]>h)
            {
                dfs(nx,ny,h);
            }
        }
    }
}
