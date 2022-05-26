package algorithm.programmers;

import java.util.Arrays;
import java.util.stream.LongStream;

public class TheHighestAndLowestRankingOfTheLotto {

	public static int[] solution(int[] lottos, int[] win_nums) {

		int[] answer = new int[2];
		

		int zeroCount = (int)Arrays.stream(lottos).filter(x -> x == 0).count();

		Arrays.sort(lottos);
		Arrays.sort(win_nums);

		int matchCount = 0;
		for(int l : lottos) {
			if(l == 0) continue;
			for(int w : win_nums) {
				if(l == w) {
					matchCount++;
					break;
				}
			}

		}
		
		
		int highestRanking = (lottos.length + 1) - (matchCount + zeroCount);
		int lowestRanking = (lottos.length + 1) - (matchCount); 
		
		answer[0] = highestRanking > 6 ? 6 : highestRanking;
		answer[1] = lowestRanking > 6 ? 6 : lowestRanking;

		return answer;
	}

	public static int[] solution2(int[] lottos, int[] winNums) {

		return LongStream.of( 
					(lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l) || l == 0).count(),
					(lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l)).count() 
				).mapToInt( x -> (int)(x > 6 ? x - 1 : x))
				.toArray();
	}
	
	public static void main(String[] args) {
		solution2(new int[] {44, 1, 0, 0, 31, 25},new int[] {31, 10, 45, 1, 6, 19});

	}
}
