package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _11003 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		Deque<Node> d = new ArrayDeque<>();
		
		for(int i=0; i<N; i++) {
			
			int now = Integer.parseInt(st.nextToken());
			
			while(!d.isEmpty() && d.getLast().value > now) {
				d.removeLast();
			}
			
			d.addLast(new Node(now, i));
			
			if(d.getFirst().index <= i - L) {
				d.removeFirst();
			}
			
			bw.write(d.getFirst().value + " "); 
		}
		
		bw.flush();
		bw.close();
	}

	static class Node {
		public int value;
		public int index;
		
		Node(int value, int index) {
			this.value = value;
			this.index = index;
		}
	}
}
