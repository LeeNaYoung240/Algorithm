
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();

       StringTokenizer st = new StringTokenizer(bf.readLine());
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());

       int[] a = new int[n];
       int[] b = new int[m];
       st = new StringTokenizer(bf.readLine());
       for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(st.nextToken());
       }
       st = new StringTokenizer(bf.readLine());
       for(int i = 0; i < m; i++){
           b[i] = Integer.parseInt(st.nextToken());
       }
       int a_num =0, b_num = 0;

       while(a_num < n && b_num < m){
           if(a[a_num] <= b[b_num]){
               sb.append(a[a_num++] + " ");
           }
           else{
               sb.append(b[b_num++] + " ");
           }
       }
       if(a_num==n)
       {
           for(int i=b_num; i<m ;i++)
           {
               sb.append(b[i] + " ");
           }
       }
       if(b_num==m)
       {
           for(int i=a_num;i<n;i++)
           {
               sb.append(a[i] + " ");
           }
       }
        System.out.println(sb);

    }
}
