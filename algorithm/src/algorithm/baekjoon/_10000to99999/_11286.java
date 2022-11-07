package algorithm.baekjoon._10000to99999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class _11286 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
			int firstAbs = Math.abs(o1);
			int secondAbs = Math.abs(o2);
			
			if(firstAbs == secondAbs) {
				return o1 > o2 ? 1 : -1;
			} else {
				return firstAbs - secondAbs; 
			}
		});  
		
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(br.readLine()); 
			if(n == 0) {
				if(pq.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(pq.poll());
				}
			} else {
				pq.add(n);
			}
		}
	}

}
