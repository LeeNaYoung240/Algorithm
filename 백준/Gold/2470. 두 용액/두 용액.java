
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int l = 0, r = n-1, p1 = 0, p2 = 0, visited;
        int min = Integer.MAX_VALUE;
        while(l<r)
        {
            visited = arr[l]+arr[r];
            int num = Math.abs(visited);
            if(min > num)
            {
                min = num;
                p1 = arr[l];
                p2 = arr[r];
            }
           if(visited == 0) break;
           else if(visited>0)
           {
               r--;
           }
           else if(visited<0)
           {
               l++;
           }
        }
        System.out.println(p1+" "+p2);
    }
}
