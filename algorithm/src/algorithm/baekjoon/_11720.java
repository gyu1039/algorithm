package algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11720 {

	public void way1() throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());

		String[] tmp = br.readLine().split("");
		int[] nums = new int[cnt];

		for(int i=0; i<cnt; i++) {
			nums[i] = Integer.parseInt(tmp[i]);
		}

		// java lambda
		// Stream.of(tmp).mapToInt(Integer::parseInt).toArray();

		int result = Arrays.stream(nums).sum();

		System.out.println(result);
	}
	
	public void way2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// String sNum = br.readLine();
		int result = 0;
		
		for(char c : br.readLine().toCharArray()) {
			result += c - 48;
		}
		
		System.out.println(result);
	}
	
	public void way3() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] cNum = br.readLine().toCharArray();
		int result = 0;
		
		for(int i=0; i<N; i++) {
			result += cNum[i] - '0';
		}
		
		System.out.print(result);
	}

	public static void main(String[] args) throws IOException {

		
	}
}
