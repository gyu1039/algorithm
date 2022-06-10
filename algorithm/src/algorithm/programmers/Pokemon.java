package algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class Pokemon {

	public int solution(int[] nums) {
        int answer = 0;
        int half = nums.length / 2;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        
        for(int n : nums) {
        	map.put(n, map.getOrDefault(n, 0) + 1);
        }
      
        for(int i=0; i<half; i++) {
        	
        	for(int key : map.keySet()) {
        		
        		if(map.get(key) != 0 ) {
        			answer++;
        			map.remove(key);
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	
}
