package algorithm.programmers.codingtest;

import java.util.ArrayList;
import java.util.List;

public class ClosestCharacter {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        List<Character> list = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            char cur = s.charAt(i);

            answer[i] = !list.contains(cur) ? -1 : i - list.lastIndexOf(cur);
            list.add(cur);
        }

        return answer;
    }
}
