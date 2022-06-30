package algorithm.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FailureRate {

	public static int[] solution(int N, int[] stages) {
        
		Map<Integer, Double> rate = new HashMap<>();
        int[] answer = new int[N];
		
        Arrays.sort(stages);
        
        int sLen = stages.length;
        int idx = 0;
        
        for(int i=1; i<=N; i++) {
        	
        	if(stages[idx] != i) {
        		rate.put(i, 0.0);
        		idx++;
        		continue;
        	}
        	
        	int cnt = theNumberOfN(stages[idx], stages);
        	rate.put(i, cnt / (double)sLen);
        	idx += cnt;
        	sLen -= cnt;
        	
        }

        Comparator<Entry<Integer, Double>> comparator = new Comparator<Entry<Integer, Double>>() {
			@Override
			public int compare(Entry<Integer, Double> e1, Entry<Integer, Double> e2) {
				
				return e1.getValue() > e2.getValue() ? 1 : -1;
			}
        };
        
        for(int i=0; i<N; i++) {
        	
        	Entry<Integer, Double> e1 = Collections.max(rate.entrySet(), comparator);
        	
        	answer[i] = e1.getKey();
        	rate.remove(e1.getKey());
        }
        
        return answer;
    }
	
	public static int theNumberOfN(int n, int[] ar) {
			
		int ret = 0;
		
		for(int c : ar) {
			if(c == n) {
				ret++;
				continue;
			}
		}
		return ret;
	}
	
	
	public static void main(String[] args) {
		
		int[] t = solution(4, new int[] {4,4,4,4,4});
		
		for(int n : t) {
			System.out.println(n);
		}
		
	}
	
}
