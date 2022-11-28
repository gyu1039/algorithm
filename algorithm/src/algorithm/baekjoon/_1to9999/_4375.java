package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4375 {

	public static void main(String[] args) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		StringBuilder result = new StringBuilder();

		
		while(s != null && !s.equals("")) {

			int n = Integer.parseInt(s);
			int k = 0;
			for (int i=1;;i++) {
				k = k*10 +1;
				k = k%n;
				if (k==0) {
					result.append(i).append("\n");
					break;
				}
			}
			 
			s = br.readLine();
		}

		System.out.println(result);
		
	}
}
