
import java.util.*;
import java.io.*;

public class Main {
    static long[] arr;

    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(bf.readLine());

       if(n%2==0)
       {
           System.out.println("CY");
       }
       else
           System.out.println("SK");
    }
}
