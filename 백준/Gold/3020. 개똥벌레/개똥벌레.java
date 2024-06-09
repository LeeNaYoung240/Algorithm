import java.util.*;
import java.io.*;

public class Main {
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  //동굴의 길이 (총 석순과 종유석 개수)
        int h = Integer.parseInt(st.nextToken());  //동굴의 높이

        int[] up = new int[h+1];  //석순
        int[] down = new int[h+1];  //종유석
        for (int i = 0; i < n / 2; i++) {
            up[Integer.parseInt(br.readLine())]++;  //해당 석순의 높이 인덱스에 개수 추가
            down[Integer.parseInt(br.readLine())]++;  //해당 종유석의 높이 인덱스에 개수 추가
        }


        int[] upSum = new int[h+1];  // 높이가 i 이하인 석순의 수 저장할 배열
        int[] downSum = new int[h+1];  // 높이가 i 이하인 종유석의 수 저장할 배열

        // 누적합 구하기
        for(int i = 1; i <= h; i++){
            upSum[i] = upSum[i-1] + up[i];  // 높이가 i 이하인 석순의 수 저장
            downSum[i] = downSum[i-1] + down[i];  // 높이가 i 이하인 종유석의 수 저장
        }


        int min = n;  //장애물의 최솟값
        int cnt = 0;  //장애물이 최솟값인 구간의 수

        for(int i = 1; i <= h; i++) {  // 높이
            int crush = 0;

            crush += upSum[h] - upSum[i - 1];          //높이 i 이상 h 이하의 석순의 개수 (1이상 5이하) (2이상 5이하) (3이상 5이하) (4이상 5이하) (5이상 5이하)
            crush += downSum[h] - downSum[h - i];  //높이 h-i+1 이상 h 이하의 종유석 개수 (5이상 5이하) (4이상 5이하) (3이상 5이하) (2이상 5이하) (1이상 5이하)

            if (crush < min) {
                cnt = 1;
                min = crush;
            } else if (crush == min) {
                cnt++;
            }
        }

        System.out.print(min + " " + cnt);
    }
}
