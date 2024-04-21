import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int[] dx = {-1,0,1,0}; //좌,상,우,하
    static int[] dy = {0,1,0,-1};
    static int[][] map; //연구소 맵
    static int max =0;
    static int N,M;
    static int[][] virusmap; //바이러스가 퍼진 후 맵
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken()); //연구소 맵에 입력 받음
            }
        }
        dfs(0); //dfs 호출
        System.out.println(max);
    }
    // 벽 세우기 => 백트래킹
    private static void dfs(int wall)
    {
        if(wall == 3)
        {
            bfs();//bfs 호출 -> 바이러스를 퍼뜨림
            return;
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(map[i][j] == 0)
                {
                    map[i][j] =1;
                    dfs(wall+1);
                    map[i][j] = 0;
                }
            }
        }
    }
    //바이러스
    private static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        virusmap = new int[N][M]; //바이러스가 퍼진 후 지도를 저장할 배열
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                virusmap[i][j] =map[i][j];
                if(virusmap[i][j] == 2)
                {
                    q.add(new int[] {i,j}); // (i, j)라는 좌표를 가지는 새로운 요소를 큐에 추가
                }
            }
        }
        while(!q.isEmpty()) //큐에 요소가 남아있는 동안 바이러스 퍼뜨리기
        {
            int[] tmp = q.poll(); //큐에서 하나의 요소를 꺼내 tmp 배열에 저장
            int x = tmp[0];
            int y = tmp[1];
            for(int i=0;i<4;i++)
            {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<M && virusmap[nx][ny]==0)
                {
                    virusmap[nx][ny] = 2;
                    q.add(new int[]{nx,ny}); //바이러스가 퍼지는 위치를 큐에 추가
                }
            }
        }
        int cnt =0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<M;j++)
            {
                if(virusmap[i][j] == 0)
                    cnt++;
            }
        }
        max = Math.max(cnt,max);
    }
}

