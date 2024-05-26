import java.util.*;
import java.io.*;

public class Main {
    static int[][] grid;
    static boolean[] visited;
    static int n;
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine());
        grid = new int[2][n+1];
        visited = new boolean[n+1];
        for(int i=1;i<=n;i++)
        {
            grid[0][i] = i; // 1 2 3 4 5 6 7
            grid[1][i] = Integer.parseInt(bf.readLine()); // 3 1 1 5 5 4 6
        }
        for(int i=1;i<=n;i++)
        {
            visited[i] = true;
            dfs(i,i);
            visited[i] = false;
        }
        Collections.sort(list); // 정렬
        System.out.println(list.size());
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
    public static void dfs(int x, int y)
    {
        if(!visited[grid[1][x]])
        {
            visited[grid[1][x]] = true;
            dfs(grid[1][x],y);
            visited[grid[1][x]] = false;
        }
        if(grid[1][x]==y)
            list.add(y);

    }
}
