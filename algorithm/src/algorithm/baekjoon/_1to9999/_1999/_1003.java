package algorithm.baekjoon._1to9999._1999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class _1003 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		List<Integer> input = new ArrayList<>();
		int max = 0;
		for(int i=0; i<T; i++) {
			input.add(Integer.parseInt(br.readLine()));
			if(max < input.get(i)) {
				max = input.get(i);
			}
		}
		
		long[][] result = new long[max + 2][2];

		result[0][0] = 1;
		result[1][1] = 1;
		
		for(int i=2; i<max+1; i++) {

			result[i][0] = result[i-1][0] + result[i-2][0];
			result[i][1] = result[i-1][1] + result[i-2][1];
		}

		for(int n : input) {	
			sb.append(result[n][0]).append(" ").append(result[n][1]).append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();

	}
}
