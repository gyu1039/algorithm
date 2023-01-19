package algorithm.programmers.codingtest;

import java.util.*;
import java.util.stream.Collectors;

public class ChooseTangerine {

    public int solution(int k, int[] tangerine) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int n : tangerine) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());

        int count = 0;
        for (int n : list) {
            k -= n;
            count++;
            if (k <= 0) {
                break;
            }
        }

        return count;
    }


}
