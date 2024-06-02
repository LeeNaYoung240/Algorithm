import java.util.*;
import java.io.*;

public class Main {
    static int[] pay; // 결제 금액
    static int max; // 최대 결제 금액
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        pay = new int[n];
        for(int i=0;i<n;i++){
            pay[i] = Integer.parseInt(bf.readLine()); // 결제 금액
            max = Math.max(max,pay[i]); // 최대 결제 금액
        }

        int low = max;
        int high = 10_000 * 100_000;
        int cnt = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (m >= getWithdrawalCount(mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(result);
    }
    static int getWithdrawalCount(int withdrawalAmount) {
        int count = 1;
        int money = withdrawalAmount;

        for (int i : pay) {
            money -= i; 
            // 돈이 모자라면 현금을 다시 인출하여 사용
            if (money < 0) {
                ++count;
                money = withdrawalAmount - i;
            }
        }
        return count;
    }
}
