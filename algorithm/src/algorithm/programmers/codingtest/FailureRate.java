package algorithm.programmers.codingtest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FailureRate {

	public static int[] solution(int N, int[] stages) {
        
		Map<Integer, Double> rate = new HashMap<>();
		Map<Integer, Integer> table = new HashMap<>(N);
        
		int[] answer = new int[N];

		Arrays.sort(stages);
		
		int tCnt = 0;
		int tIdx = 0;
		
        for(int i=1; i<=N; i++) {
        	
        	for(int j=tIdx; j<stages.length; j++) {
        		
        		if(stages[j] != i) {
        			break;
        		}
        		tCnt++;
        	}
        	
        	table.put(i, tCnt);
        	tIdx += tCnt;
        	tCnt=0;
        }
        
        int sLen = stages.length;
        
        for(int i=1; i<=N; i++) {
        	
        	int cnt = table.get(i);
        	rate.put(i, cnt / (double) sLen);
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
	
	
	public int[] solution2(int N, int[] stages) {
		
		int[] answer = new int[N];
		int arrLen = stages.length;
		
		for(int i=0; i<arrLen; i++) {
			int stage = stages[i];
			if(stage != N + 1) {
				answer[stage - 1] += 1;
			}
		}
		
		double[] rateArray = new double[N];
		int remainingNumber = arrLen;
		
		for(int i=0; i<N; i++) {
			int personNum = answer[i];
			rateArray[i] = (double) personNum / remainingNumber;
			remainingNumber -= personNum;
			answer[i] = i + 1;
		}
		
		double tmpD = 0;
		int tmpI = 0; 
		
		for(int i=0; i<N; i++) {
			for(int j=1; j<N-i; j++) {
				
				if(rateArray[j - 1] < rateArray[j]) {
					
					tmpD = rateArray[j - 1];
					rateArray[j - 1] = rateArray[j];
					rateArray[j] = tmpD;
					
					tmpI = answer[j - 1];
					answer[j - 1] = answer[j];
					answer[j] = tmpI;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		int[] t = solution(4, new int[] {4,4,4,4,4});
		
		for(int n : t) {
			System.out.println(n);
		}
		
	}
	
}
