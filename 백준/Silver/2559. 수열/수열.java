import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] psum = new int[n+1];

        int sumValue = 0;
        int max = Integer.MIN_VALUE;
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
             sumValue += Integer.parseInt(st.nextToken());
             psum[i+1] = sumValue;
        }
        for(int i=k;i<=n;i++)
        {
            max = Math.max(max,psum[i]-psum[i-k]);
        }
        System.out.println(max);
    }
}
