import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       int T = Integer.parseInt(bf.readLine());

       for(int i=0;i<T;i++)
       {
           int minX=0,minY=0,maxX=0,maxY=0,dir=0,nowX=0,nowY=0;
           String s = bf.readLine();
           for(int j=0;j<s.length();j++)
           {
               char c = s.charAt(j);

               if(c=='F')
               {
                   nowX=nowX+dx[dir];
                   nowY=nowY+dy[dir];
               }
               else if(c=='B')
               {
                   nowX=nowX-dx[dir];
                   nowY=nowY-dy[dir];
               }
               else if(c=='L')
               {
                   if(dir==0)
                   {
                       dir=3;
                   }
                   else
                       dir--;
               }
               else if(c=='R')
               {
                   if(dir==3)
                       dir=0;
                   else
                       dir++;
               }
               minX=Math.min(minX,nowX);
               maxX=Math.max(maxX,nowX);
               maxY=Math.max(maxY,nowY);
               minY=Math.min(minY,nowY);
           }
           sb.append((Math.abs(minX)+Math.abs(maxX))*(Math.abs(minY)+Math.abs(maxY))+"\n");
       }
        System.out.println(sb.toString());
    }
}

