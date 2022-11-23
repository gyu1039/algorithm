package algorithm.programmers.codingtest;

public class MaxAndMin {

	public String solution(String s) {

		int min, max;
		String[] ar = s.split(" ");
		min = max = Integer.parseInt(ar[0]);

		for(String n : ar) {
			int cur = Integer.parseInt(n);
			if(min > cur) {
				min = cur;
				continue;
			}

			if(max < cur) {
				max = cur;
			}
		}


		return min + " " + max;
	}


	public static void main(String[] args) {

		System.out.println("-2".compareTo("-10"));
	}
}
