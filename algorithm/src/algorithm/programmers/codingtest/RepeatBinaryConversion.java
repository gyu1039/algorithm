package algorithm.programmers.codingtest;

public class RepeatBinaryConversion {

	public int[] solution(String s) {

		int numberOfConversion = 0;
		int numberOfZerosRemoved = 0;

		int temp;
		while(!s.equals("1")) {
			temp = s.length();
			s = s.replaceAll("0", "");
			numberOfZerosRemoved += temp - s.length();

			temp = s.length();
			s = Integer.toBinaryString(temp);
			numberOfConversion++;

		}

		return new int[] {numberOfConversion, numberOfZerosRemoved}; 
	}
}


