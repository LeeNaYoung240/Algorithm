import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {0,0};
        PriorityQueue<Integer> min = new PriorityQueue<Integer>(); //오름차순
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder()); // 내림차순
        
        for(int i=0;i<operations.length;i++)
        {
            String[] str = operations[i].split(" ");
            int num = Integer.parseInt(str[1]);
            
            if(str[0].equals("I"))
            {
                max.offer(num);
                min.offer(num);
            }
            else if(str[0].equals("D") && num==1 && !max.isEmpty())
            {
                min.remove(max.poll());   
            }
            else if(str[0].equals("D") && num==-1 && !max.isEmpty())
            {
                max.remove(min.poll());
            }
        }
        
        if(!min.isEmpty() && !max.isEmpty())
        {
            return new int[]{max.peek(), min.peek()};
        }
        
        return new int[]{0,0};
    }
}