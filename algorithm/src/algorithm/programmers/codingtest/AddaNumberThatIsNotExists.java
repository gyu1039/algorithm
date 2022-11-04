package algorithm.programmers.codingtest;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AddaNumberThatIsNotExists {

	public int solution1(int[] numbers) {

		return IntStream.range(0, 10).filter( i ->
		!Arrays.stream(numbers).anyMatch(x -> x == i)
				).sum();
	}

	public int solution2(int[] numbers) {

		int sum = 45;
		for (int i : numbers) 
			sum -= i;
		
		
		return sum; //  return 45-Arrays.stream(numbers).sum();
	}
	
	public int solution3(int[] numbers) {
        return IntStream.range(0, 10)
        		.filter(i -> Arrays.stream(numbers).noneMatch(num -> i == num)).sum();
    }
}
