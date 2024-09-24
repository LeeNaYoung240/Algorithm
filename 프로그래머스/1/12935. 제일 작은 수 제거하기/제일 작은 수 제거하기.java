class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int min = Integer.MAX_VALUE;
        int idx = 0;
        if(arr.length == 1)
        {
            return answer;
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
                idx = i;
            }
        }
        int[] result = new int[arr.length-1];
        int resultIdx = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(i!= idx)
            {
                result[resultIdx] = arr[i];
                resultIdx++;
            }
        }
        return result;
    }
}