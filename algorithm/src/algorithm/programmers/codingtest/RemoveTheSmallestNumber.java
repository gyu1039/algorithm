package algorithm.programmers.codingtest;

import java.util.*;

public class RemoveTheSmallestNumber {
	
    public int[] solution(int[] arr) {
        
        if(arr.length == 1) {
            return new int[] {-1};
        }
        
        int indexOfsv = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[indexOfsv] > arr[i]) {
                indexOfsv = i;
            }
            
            list.add(arr[i]);
        }
        
        list.remove(indexOfsv);
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
