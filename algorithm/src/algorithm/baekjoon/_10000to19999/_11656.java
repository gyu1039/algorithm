package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class _11656 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length();
		String[] arr = new String[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = s.substring(i, len);
		}
		Arrays.sort(arr);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(String t : arr) {
			bw.write(t);
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
