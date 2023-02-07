package algorithm.baekjoon._10000to99999._10999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class _10866 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> d = new ArrayDeque<>();

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			if(str.equals("push_front")) {
				d.addFirst(Integer.parseInt(st.nextToken()));

			} else if(str.equals("push_back")) {
				d.addLast(Integer.parseInt(st.nextToken()));

			} else if(str.equals("pop_front")) {
				int tmp = d.isEmpty() == true ? -1 : d.pollFirst();
				sb.append(tmp).append("\n");

			} else if(str.equals("pop_back")) {
				int tmp = d.isEmpty() == true ? -1 : d.pollLast();
				sb.append(tmp).append("\n");

			} else if(str.equals("size")) {
				sb.append(d.size()).append("\n");

			} else if(str.equals("empty")) {
				int tmp = d.isEmpty() == true ? 1 : 0;
				sb.append(tmp).append("\n");

			} else if(str.equals("front")) {
				int tmp = d.isEmpty() == true ? -1 : d.peekFirst();
				sb.append(tmp).append("\n");

			} else if(str.equals("back")) {
				int tmp = d.isEmpty() == true ? -1 : d.peekLast();
				sb.append(tmp).append("\n");
			}

		}

		System.out.println(sb);
	}
}
