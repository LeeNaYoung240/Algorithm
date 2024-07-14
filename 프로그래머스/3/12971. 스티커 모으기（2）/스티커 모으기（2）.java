class Solution {
    private static int[] dp1, dp2;

    public static int solution(int sticker[]) {
        int n = sticker.length;

        if(n==1) return sticker[0];

        dp1 = new int[n];
        dp2 = new int[n];

        dp1[0] = sticker[0];  // 1
        dp1[1] = sticker[0];  // 1
        
        // 첫 번째 스티커를 떼니까 인덱스 n-2까지
        for(int i=2; i<n-1; i++){
            dp1[i] = Math.max(dp1[i-2]+sticker[i], Math.max(dp1[i-1], dp1[i-2]));
        } // 6

        dp2[0] = 0; // 1
        dp2[1] = sticker[1];  // 3
        // 첫 번째 스티커를 떼지 않으니 인덱스 n-1까지
        for(int i=2; i<n; i++){
            dp2[i] = Math.max(dp2[i-2]+sticker[i], Math.max(dp2[i-1], dp2[i-2]));
        } // dp2[2] = 1+2 = 3, dp2[3] = 3+5 = 8, dp2[4] = 3+4, 8 => 8 

        return Math.max(dp1[n-2], dp2[n-1]);
    }
}