import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<Integer>[] list; //각 정점의 인접 리스트 저장
    public static boolean[] visited; //방문
    public static int[] arr; //부모 정점
    public static void main(String[] args) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       int n = Integer.parseInt(bf.readLine());
       // 정점 번호 1부터 시작
       list = new ArrayList[n+1];
       visited = new boolean[n+1];
       arr = new int[n+1];
        //1부터 n까지 정점에 대해 빈 ArraList 생성 - list 배열의 각 요소로 초기화
       for(int i = 1; i <= n; i++){
           list[i] = new ArrayList<Integer>();
       }
       for(int i=0;i<n-1;i++)
       {
           st = new StringTokenizer(bf.readLine());
           int x = Integer.parseInt(st.nextToken());
           int y = Integer.parseInt(st.nextToken());

           list[x].add(y);
           list[y].add(x);
       }
       //1번 정점에서 dfs 시작
       dfs(1);
       //2번 ~ n번까지 부모 정점 출력
       for(int i=2;i<=n;i++)
       {
           System.out.println(arr[i]);
       }
    }
    public static void dfs(int x){
        visited[x] = true;
        for(int value : list[x])
        {
            if(!visited[value])
            {
                arr[value] = x;
                dfs(value);
            }
        }
    }
}
