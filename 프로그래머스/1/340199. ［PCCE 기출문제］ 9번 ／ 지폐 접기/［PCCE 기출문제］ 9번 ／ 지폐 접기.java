import java.util.*;
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        Arrays.sort(wallet); // min: wallet[0], max:wallet[1]
        Arrays.sort(bill); // min:bill[0], max:bill[1] 
        
        while(!fit(wallet,bill))
        {
            if(bill[0] > bill[1])
            {
                bill[0]/=2;
    
            }
            else{
                bill[1]/=2;
            }
            Arrays.sort(bill);
            answer++;
        }
        
        return answer;
    }
    public static boolean fit(int[] wallet, int[] bill)
    {
        return (bill[0] <= wallet[0] && bill[1] <= wallet[1]);
    }
}