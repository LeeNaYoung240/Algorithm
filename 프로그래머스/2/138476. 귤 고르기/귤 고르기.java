import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
   int answer = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int item : tangerine) {
      map.put(item, map.getOrDefault(item, 0) + 1);
    }

    List<Integer> list = new ArrayList<>(map.keySet());
    Collections.sort(list,
        (v1, v2) -> (map.get(v2).compareTo(map.get(v1))));

    for (int item : list) {
      int val = k -= map.get(item);
      answer++;
      if (val <= 0) {
        break;
      }
    }
    return answer;
    }
}