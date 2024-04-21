import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int[] dx = {-1,0,1,0}; //좌,상,우,하
    static int[] dy = {0,1,0,-1}; //좌,상,우,하
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //키보드 입력 바이트 스트림을 char 타입으로 처리 후, string 타입으로 변환하여 저장
        StringBuilder sb = new StringBuilder();
        //StringBuilder는 변경 가능한 문자열을 만들어 주기 때문에, String을 합치는 작업시 사용
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++)
        {
            int minX=0,minY=0,maxX=0,maxY=0,dir=0,nowX=0,nowY=0;
            String s = bf.readLine(); //테스트 케이스만큼 입력 받음

            for(int j=0;j<s.length();j++) //받은 문자의 길이만큼
            {
                char c = s.charAt(j); //문자열을 하나씩 입력 받음
                if(c=='F')
                {
                    nowX=nowX+dx[dir];//nowX라는 변수에 dx[]의 좌표를 더함
                    nowY=nowY+dy[dir]; //nowY라는 변수에 dy[]의 좌표를 더함
                }
                else if(c=='B')
                {
                    nowX=nowX-dx[dir]; //nowX라는 변수에 dx[]의 좌표 뺄셈
                    nowY=nowY-dy[dir];//nowY라는 변수에 dy[]의 좌표 뺄셈
                }
                else if(c=='L')
                {
                    if(dir==0)
                        dir=3;
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
                minY=Math.min(minY,nowY);
                maxX=Math.max(maxX,nowX);
                maxY=Math.max(maxY,nowY);
            }
            sb.append((Math.abs(minX)+Math.abs(maxX))*(Math.abs(minY)+Math.abs(maxY))+"\n");
        }
        System.out.println(sb.toString());
    }
}

