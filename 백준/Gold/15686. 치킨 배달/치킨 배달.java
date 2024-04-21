import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int N,M;
    static ArrayList<int[]> house = new ArrayList<>(); //집 좌표를 저장하기 위한 리스트 선언
    static ArrayList<int[]> chicken = new ArrayList<>(); //치킨 집 좌표를 저장하기 위한 리스트 선언
    static ArrayList<int[]> choice = new ArrayList<>(); //선택한 치킨집을 저장하기 위한 리스트 선언
    static int result = Integer.MAX_VALUE; //결과값 변수 초기화
    static boolean[] visited; //치킨집 방문 여부를 체크하기 위한 배열
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //키보드 입력 바이트스트림을 char 타입으로 처리후 String 타입으로 변환하여 저장
        StringTokenizer st = new StringTokenizer(bf.readLine());
        //readLine()을 통해 한 줄을 입력 받고 공백으로 토큰 나눔

        N = Integer.parseInt(st.nextToken()); //맵 크기 입력 받음
        int[][] arr = new int[N][N]; //NxN 크기의 배열 생성
        M = Integer.parseInt(st.nextToken()); //선택한 치킨 집 개수 입력
        //맵 정보 입력
        for(int r=0;r<N;r++)
        {
            st = new StringTokenizer(bf.readLine());
            for(int c=0;c<N;c++)
            {
                arr[r][c] = Integer.parseInt(st.nextToken()); //맵 크기에 수 입력 받음
                if(arr[r][c]==1) //집 좌표
                {
                    house.add(new int[]{r,c}); //집 좌표 저장
                }
                if(arr[r][c]==2) //치킨집 좌표 저장
                {
                    chicken.add(new int[]{r,c}); //치킨집 좌표 저장
                }
            }
        }
        visited = new boolean[chicken.size()]; //치킨집 방문 여부 배열 초기화
        //해당 배열은 치킨집 리스트의 크기에 맞춰 초기화 됨, 이 배열이 각 치킨집의 방문 여부를 저장하기 때문
        dfs(0,0); //dfs 호출
        System.out.println(result); //결과 출력
    }

    static void dfs(int depth,int start)
    {
        // depth : 현재까지 선택한 치킨집의 수, 재귀호출이 진행될 때마다 증가, 선택된 치킨집의 수가 M가 같아지면
        // 우리가 몇 개의 치킨집을 선택했는지 알려줌, 우리가 현재까지 얼마나 많은 치킨집을 선택했는지를 나타냄
        // start : 현재까지 고려한 치킨집 리스트에서 다음에 선택할 치킨집의 인덱스를 나타냄, 중복 선택을 방지하기 위해 사용
        //우리가 어디서부터 치킨집을 고려할지를 나타냄, 다음에 고려할 치킨집의 위치
        if(depth==M) //M개의 치킨집을 선택했을 때
        {
            int sum = 0; //거리 합을 저장할 변수 초기화
            for(int[] h:house) //모든 집에 대해서
            {
                int min = Integer.MAX_VALUE; //최소 거리 초기화
                for(int[] c:choice) //선택된 치킨집과의 거리 계산
                {
                    int d = Math.abs(h[0]-c[0])+Math.abs(h[1]-c[1]); //거리 계산
                    min = Math.min(d,min); //최소 거리를 min 변수에 저장
                }
                sum+=min; //구한 최소거리를 sum 변수에 저장
            }
            result = Math.min(result,sum); //최소 거리의 합 중 최소값만 저장
            return;
        }
        for(int i=start;i<chicken.size();i++) //start부터 시작하여 모든 치킨집들을 탐색
        {
            if(!visited[i]) //아직 선택되지 않은 치킨집의 경우, dfs를 통해 다음 치킨집을 탐색
            {
                visited[i] = true; //방문 표시
                choice.add(chicken.get(i)); //선택한 치킨집은 choice 리스트에 추가
                dfs(depth+1,i+1); //dfs 재귀 호출 (다음 치킨집으로)
                choice.remove(choice.size()-1); //dfs가 끝났다면 choice 리스트를 비우기 위한 로직
                visited[i] = false; //해당 치킨집ㅂ을 다시 방문할 수 있도록 false로 초기화
                //해당 과정을 통해 모든 경우의 수를 탐색하고 선택된 치킨집의 수가 M이 되면 재귀가 멈추게 됨
            }
        }
    }
}
// 치킨집들중 M개의 치킨집을 골라 choice 리스트에 담음
// choice 리스트에 M개의 치킨집이 저장되어있다면 집과 선택한 치킨집들과의 최소거리를 구함
// 구한 각집과 선택한 치킨집과의 최소거리를 모두 더했다면
// 치킨집들 중 아까와 다른 M개의 치킨집을 골라 반복
