import java.util.*;
import java.io.*;

public class Main {
    static int[] grid; // 학생 들의 번호 선택 저장 배열
    static boolean[] visited; // 방문 여부
    static int T, N;
    static boolean[] finished; // dfs 완료 여부
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(bf.readLine());
        for(int i=0;i<T;i++){
            N = Integer.parseInt(bf.readLine());
            grid = new int[N+1];
            visited = new boolean[N+1];
            finished = new boolean[N+1];
            cnt = 0;

            st = new StringTokenizer(bf.readLine());
            for(int j=1;j<=N;j++){
                grid[j] = Integer.parseInt(st.nextToken());
            }
            for(int k=1; k<=N; k++){
                if (!visited[k]) {
                    dfs(k);
                }
            }
            System.out.println(N - cnt); // 사이클에 포함되지 않은 학생 수
        }
    }
    public static void dfs(int now)
    {
        if(visited[now]) return; // 이미 방문한 경우 리턴
        visited[now] = true; // 현재 노드 방문 표시

        int next = grid[now]; // 현재 노드가 선택한 다음 노드
        if(!visited[next]) {
            dfs(next); // 다음 노드 dfs 수행
        }
        else {
            if (!finished[next]) {
                cnt++;
                int i = next;
                while (i != now) {
                    cnt++;
                    i = grid[i];
                }
            }
        }
        finished[now] = true; // 현재 노드 dfs 완료 표시
    }
}
