import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int left=0, right=-1;
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, arr[i]);
        }

        int m = Integer.parseInt(bf.readLine());
        while(left<=right) {
            int mid = (left+right)/2;
            long budget =0;
            for(int i=0; i<n; i++) {
                if(arr[i]>mid) budget += mid;
                else budget+= arr[i];
            }
            if(budget<=m) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        System.out.println(right);
    }
}
