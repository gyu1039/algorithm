package algorithm.programmers.codingtest;

public class WatermelonRepeat {
	public String solution(int n) {
		return "수박".repeat(n/2) + "수".repeat(n%2);
	}
}