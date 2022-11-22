package algorithm.programmers.codingtest;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ADividedArrayOfNumbers {
	
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            if(n % divisor == 0) {
                list.add(n);
            }
        }
        
        int[] answer;
        if(list.size() == 0) {
            answer = new int[]{-1};
            return answer;
        } 
        
        Collections.sort(list);
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}
