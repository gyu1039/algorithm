package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i=1; i<=n; i++) {
			deque.add(i);
		}
		
		while(deque.size() > 1) {
			
			deque.poll();
			
			if(deque.size() > 1) {
				deque.add(deque.poll());
			}
			
		}
		
		System.out.println(deque.poll());

	}

}
