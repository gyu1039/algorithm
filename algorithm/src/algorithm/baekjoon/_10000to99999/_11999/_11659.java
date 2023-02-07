package algorithm.baekjoon._10000to99999._11999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11659 {

	public void way1() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nextLine = br.readLine().split(" ");
		int N = Integer.parseInt(nextLine[0]);
		int M = Integer.parseInt(nextLine[1]);
		
		nextLine = br.readLine().split(" ");

		int[] aPartialSumArray = new int[N+1];
		int index=1;
		for(String s : nextLine) {
			
			int n = Integer.parseInt(s);
			aPartialSumArray[index] = n + aPartialSumArray[index-1];
			index++;
		}
		
		for(int k=0; k<M; k++) {
			
			nextLine = br.readLine().split(" ");
			int i = Integer.parseInt(nextLine[0].trim());
			int j = Integer.parseInt(nextLine[1].trim());
			
			System.out.println(aPartialSumArray[j] - aPartialSumArray[i-1]);
			
		}
	}
	
	public void way2() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		long[] sumOfIntervals = new long[N+1];
		st = new StringTokenizer(br.readLine());
		
		for(int i=1; i<=N; i++) {
			sumOfIntervals[i] = sumOfIntervals[i-1] + Integer.parseInt(st.nextToken()); 
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int index=0; index<M; index++) {
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			sb.append(sumOfIntervals[j] - sumOfIntervals[i-1] + "\n");
		}
		
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws IOException {

		
	}

}
