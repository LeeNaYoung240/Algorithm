
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cnt = 1;
        while(true)
        {
            st = new StringTokenizer(bf.readLine());
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());
            if(L==0 && P==0 && V==0)break;

            int result = L*(V/P)+Math.min(L,V%P);
            System.out.println("Case "+cnt+": "+result);
            cnt++;
        }
    }
}
