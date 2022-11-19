package algorithm.programmers.codingtest;

import java.util.stream.IntStream;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		
		int n = 10;
		IntStream.rangeClosed(1, n).filter((num) -> num%2 == 0).sum();
	}
}
