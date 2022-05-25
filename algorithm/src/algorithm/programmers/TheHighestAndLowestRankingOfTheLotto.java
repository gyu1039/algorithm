package algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TheHighestAndLowestRankingOfTheLotto {

	public static int[] solution(int[] lottos, int[] win_nums) {
		
		int[] answer = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		map.put(6, 1);
		map.put(5, 2);
		map.put(4, 3);
		map.put(3, 4);
		map.put(2, 5);
		map.put(1, 6);
		map.put(0, 6);
		
		int zeroCount = (int)Arrays.stream(lottos).filter(x -> x == 0).count();
		
		Arrays.sort(lottos);
		Arrays.sort(win_nums);
		
		int matchCount = 0;
		for(int l : lottos) {
			if(l == 0) continue;
			for(int w : win_nums) {
				if(l == w) {
					System.out.println(l + " " + w);
					matchCount++;
					break;
				}
			}
			
		}
				
		answer[0] = map.get(matchCount);
		answer[1] = map.get(matchCount + zeroCount);
		
		return answer;
	}
	
	public static void main(String[] args) {
		solution(new int[] {44, 1, 0, 0, 31, 25},new int[] {31, 10, 45, 1, 6, 19});
		
	}
}
