package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int sLen = s.length();
		int N = Integer.parseInt(s);
		
		int result = 0;
		
		for(int i=(N-sLen*9); i<N; i++) {
			
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == N) {
				result = i;
				break;
			}
		}
		
		System.out.println(result);
	}
	
	public static void way2() throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		int sum = Integer.parseInt(s);
		
		
		int n = 0;
		int comp;
		int tmp = 1;
		
		while(true) {
			comp = 0;
			n++;
			tmp = n;
			comp += tmp;
			while(tmp > 0) {
				comp += tmp%10;
				tmp /= 10;
			}
		
			if(sum == comp) {
				System.out.println(n);
				return;
			}
			
			if(n > sum) {
				break;
			}
			
			tmp++;
		}
		
		System.out.println(0);
		
	}
}
