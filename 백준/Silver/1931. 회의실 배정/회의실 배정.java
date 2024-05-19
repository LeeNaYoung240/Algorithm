
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int[][] time = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); //시작 시간
            time[i][1] = Integer.parseInt(st.nextToken()); //종료 시간
        }
        // 종료 시간을 기준으로 오름차순 정렬
        Arrays.sort(time,new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                // 종료시간이 같다면 시작 시간을 기준으로 오름차순
                if(a[1] == b[1])
                {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            }
        });
        int cnt =0;
        int prev_end_time = 0;

        for(int i = 0; i < n; i++) {

            // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
            if(prev_end_time <= time[i][0]) {
                prev_end_time = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
