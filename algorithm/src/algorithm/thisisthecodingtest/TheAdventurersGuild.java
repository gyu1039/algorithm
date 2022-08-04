package algorithm.thisisthecodingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheAdventurersGuild {

	public void sol() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		
		for(String s : br.readLine().split(" ")) {
			int n = Integer.parseInt(s);
			
			list.add(n);
		}

		Collections.sort(list);
		

		int result = 0;
		int count = 0;
		
		for(int i=0; i<N; i++) {
			
			count++;
			if(count >= list.get(i)) {
				result += 1;
				count = 0;
			}
		}

		System.out.println(result);
	}
	

	
}
