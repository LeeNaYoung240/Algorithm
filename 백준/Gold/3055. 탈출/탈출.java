
import java.util.*;
import java.io.*;

public class Main {
    static char[][] grid;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    static Queue<int[]> q = new LinkedList<>();
    static Queue<int[]> w = new LinkedList<>();
    static int answer = Integer.MAX_VALUE;

    static int R,C;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            String str = bf.readLine();
            for (int j = 0; j < C; j++) {
                grid[i][j] = str.charAt(j);
                if(grid[i][j]=='S')
                {
                    q.add(new int[]{i,j,0});
                }
                else if(grid[i][j]=='*')
                {
                    w.add(new int[]{i,j});
                }
            }
        }
        bfs();

        if(answer == Integer.MAX_VALUE)
        {
            System.out.println("KAKTUS");
        }
        else
            System.out.println(answer);

    }
    public static void bfs(){
        while(!q.isEmpty()){
            int w_len = w.size();
            for(int i = 0; i < w_len; i++){
                int[] cur = w.poll();
                int x = cur[0];
                int y = cur[1];
                for(int j=0;j<4;j++)
                {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if(nx>=0 && ny>=0 && nx<R && ny<C && grid[nx][ny]=='.')
                    {
                        grid[nx][ny] = '*';
                        w.add(new int[]{nx,ny});
                    }
                }
            }
            int q_len = q.size();
            for(int i = 0; i < q_len; i++){
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                int time = cur[2];
                for(int j=0;j<4;j++)
                {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if(nx>=0 && ny>=0 && nx<R && ny<C)
                    {
                       if(grid[nx][ny]=='D')
                       {
                           answer = Math.min(answer,time+1);
                           return;
                       }
                       else if(grid[nx][ny]=='.')
                       {
                           grid[nx][ny] = 'S';
                           q.add(new int[]{nx,ny,time+1});
                       }
                    }
                }
            }
        }
    }
}
