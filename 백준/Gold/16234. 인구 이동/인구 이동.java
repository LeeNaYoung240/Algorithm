import org.w3c.dom.Node;

import java.awt.*;
import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int[][] grid;
    static boolean[][] visited;
    static int N,L,R;
    static ArrayList<Node> list; //인접한 노드들 저장하는 리스트
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken()); //최소 인구이동 가능 차이
        R = Integer.parseInt(st.nextToken()); //최대 인구이동 가능 차이
        grid = new int[N][N];
        for(int r=0;r<N;r++)
        {
            st = new StringTokenizer(bf.readLine());
           for(int c=0;c<N;c++)
           {
               grid[r][c] = Integer.parseInt(st.nextToken());
           }
        }
        System.out.println(move());
    }

    //인구 이동 처리, 무한루프를 돌며 인구 이동이 더 이상 일어나지 않을 때까지
    public static int move() {
        //인구 이동 횟수 변수
        int result = 0;
        while (true) {
            boolean isMove = false; //한번이라도 이동 가능하면 true로
            visited = new boolean[N][N]; //방문 배열 초기화
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j]) {
                        //해당 위치의 인접한 지역의 합 계산
                        int sum = bfs(i, j);
                        //인접한 지역이 있고, 현재 위치와 인접한 지역이 연결되어 있을 때(인접 지역이 최소 2개 이상일 때)
                        if (list.size() > 1) {
                            //인구 이동 메서드 실행
                            changePopulation(sum);
                            //이동 표시
                            isMove = true;
                        }
                    }
                }
            }
            //인구 이동이 없었다면 현재까지의 이동 횟수 반환
            if (!isMove)
                return result;
            //이동이 있을 경우 횟수 증가
            result++;
        }
    }
    //해당 위치와 인접한 지역의 합 계산
    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        list = new ArrayList<>();

        q.offer(new Node(x, y)); //시작 노드 큐에 삽입
        list.add(new Node(x, y)); //인접한 노드 리스트에 삽입
        visited[x][y] = true; //방문 표시

        int sum = grid[x][y]; //현재 위치의 인구수를 할당하여 초기화
        while (!q.isEmpty()) {
            Node cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur.r + dx[i];
                int ny = cur.c + dy[i];
                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny]) {
                    int diff = Math.abs(grid[cur.r][cur.c] - grid[nx][ny]); //인구 차이 계산
                    if (L <= diff && diff <= R) {
                        q.offer(new Node(nx, ny)); //큐에 삽입
                        list.add(new Node(nx, ny)); //인접한 노드 리스트에 삽입
                        sum += grid[nx][ny]; //인구의 합 계산
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        return sum;
    }
    //인구 이동하기, 인구이동이 필요한 노드들의 평균 인구 계산 후 해당 위치의 인구를 평균값으로 변경
    public static void changePopulation(int sum) {
        int avg = sum / list.size();
        for (Node node : list) {
            grid[node.r][node.c] = avg;
        }
    }

    // 탐색 성공 지점 목록(r,c)를 저장하기 위해
    //Node는 지도 상의 한 위치, 지도의 한 칸을 의미
    public static class Node {
        int r;
        int c;

        public Node(int x, int y) {
            this.r = x;
            this.c = y;
        }
    }

}
