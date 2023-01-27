package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class _1546 {
	
	public void way1() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmp = br.readLine().split(" ");
		
		int[] nums = Stream.of(tmp).mapToInt(Integer::parseInt).toArray();
		
		int max = Arrays.stream(nums).max().getAsInt();

		double avg = Arrays.stream(nums).mapToDouble(num -> (double) num).map(n -> n / max * 100).average().getAsDouble();
		
		System.out.println(avg);
	}
	
	public static void way2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(st.nextToken()); 
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i=0; i<N; i++) {
			
			if(nums[i] > max) {
				max = nums[i];
			}
			sum += nums[i];
		}
		
		System.out.println(sum * 100.0 / max / N);
	}

	public static void main(String[] args) throws IOException {

		way2();
	}
}
