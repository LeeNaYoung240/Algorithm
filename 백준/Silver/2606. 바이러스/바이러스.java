import java.util.*;
import java.io.*;

public class Main {
    static int[][] node; //컴퓨터간 연결 상태
    static int[] visited; //방문 표시
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); //컴퓨터 수
        int M  = Integer.parseInt(br.readLine()); //간선 수
        node = new int[N+1][N+1];
        visited = new int[N+1];
        for(int i=0;i<M;i++)
        {
            st = new StringTokenizer(br.readLine());
            int computer_input1 = Integer.parseInt(st.nextToken()); //첫번째 컴퓨터 번호
            int computer_input2 = Integer.parseInt(st.nextToken()); //두번재 컴퓨터 번호
            node[computer_input1][computer_input2] = 1; //컴퓨터 간 연결상태 반영
            node[computer_input2][computer_input1] = 1; //무방향 그래프이므로 양방향으로 반영
        }
        bfs(1); //1번 컴퓨터부터 시작
    }
    //바이러스 전파를 보고 감염된 컴퓨터 수 계산
    public static void bfs(int step) {
        int cnt =0; //감염된 컴퓨터 수
        Queue<Integer> q = new LinkedList<>(); //BFS 탐색 큐
        visited[step] = 1; //시작 컴퓨터에 방문표시
        q.offer(step); //시작 컴퓨터를 큐에 삽입
        while(!q.isEmpty()) { //큐가 빌 때까지 계속
            int x = q.poll(); //큐에서 정점을 하나 꺼냄

            //현재 정점과 연결된 정점들을 순회
            for(int i=1;i<node.length;i++)
            {
                //현재 컴퓨터와 연결되어있고 방문하지 않은 정점이면
                if(node[x][i]==1 && visited[i]!=1)
                {
                    //x는 현재 큐에서 꺼낸 정점, i는 현재 정점 x와 연결된 모든 정점
                    q.offer(i); //방문하지 않은 정점을 큐에 삽입
                    visited[i]=1; //방문 표시
                    cnt++; //감염된 컴퓨터 수 증가
                }
            }
        }
        System.out.println(cnt);
    }
}