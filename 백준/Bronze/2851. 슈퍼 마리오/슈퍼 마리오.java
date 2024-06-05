import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    //    StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] arr = new int[11];
        int[] sum = new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i] = Integer.parseInt(bf.readLine());
            if (i == 0) {
                sum[i] = arr[i];
            } else {
                sum[i] = sum[i - 1] + arr[i];
            }
        }
        int sumValue = 0;
        for (int i = 0; i < 10; i++) {
            if (Math.abs(100 - sum[i]) <= Math.abs(100 - sumValue)) {
                sumValue = sum[i];
            }
        }

        System.out.println(sumValue);
    }
}
