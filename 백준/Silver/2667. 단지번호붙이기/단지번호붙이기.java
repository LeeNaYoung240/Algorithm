import java.awt.*;
import java.util.*;
import java.io.*;

public class Main {
    static int[][] grid; //지도
    static int[][] visited; //방문여부
    static int N;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static ArrayList al = new ArrayList();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(bf.readLine());
        grid = new int[N][N];
        visited = new int[N][N];
        int cnt = 0;
        //전체 지도 입력 받기
        for(int i=0;i<N;i++)
        {
            String str = bf.readLine();
            for(int j=0;j<N;j++)
            {
                grid[i][j] = str.charAt(j)-'0';
            }
        }
        //전체 지도를 탐색, 각 섬 크기 count
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(grid[i][j] == 1 && visited[i][j]!=1) //지도에 1로 표시되어있지만 방문하지 않았을 경우
                {
                    bfs(i,j); //bfs 함수로 해당 섬의 크기 계산
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        Collections.sort(al); //섬의 크기 정렬
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
    }
    static void bfs(int x, int y)
    {
        int nx,ny;
        int local_cnt = 1;
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(x,y)); //시작점을 큐에 추가
        visited[x][y] = 1; //시작점 방문 표시
        while(!q.isEmpty())
        {
            Point now = q.poll(); //큐에서 하나의 점을 꺼냄
            for(int i=0;i<4;i++)  //상.하.좌.우 탐색
            {
                nx = now.x+dx[i];
                ny = now.y+dy[i];
                if(nx>=0 && ny>=0 && nx<N && ny<N)
                {
                    if(grid[nx][ny]==1 && visited[nx][ny]!=1)
                    {
                        q.add(new Point(nx,ny)); //큐에 추가
                        visited[nx][ny] = 1; //방문 표시
                        local_cnt++; 
                    }
                }
            }
        }
        al.add(local_cnt); //섬의 크기를 리스트에 추가
    }
}
