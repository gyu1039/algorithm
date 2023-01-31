package algorithm.programmers.codingtest;

import java.util.HashSet;
import java.util.Set;

public class TheNumberOfSumsOfConsecutiveSubsequences {

    public int solution(int[] elements) {

        Set<Integer> set = new HashSet<>();

        for(int i=0; i<elements.length; i++) {
            int n = elements[i];

            for(int j=i+1; j<i+elements.length; j++) {
                set.add(n);
                n += elements[j % elements.length];
            }
        }


        return set.size() + 1;
    }
}
