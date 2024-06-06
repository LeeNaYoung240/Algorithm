import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] psum = new int[n+1];
        int sumValue = 0;
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            sumValue += Integer.parseInt(st.nextToken());
            psum[i+1] = sumValue;
        }
  
        for(int i=0;i<m;i++){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            System.out.println(psum[y]-psum[x-1]);
        }
    }
}
