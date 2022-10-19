package algorithm.baekjoon._10000to19999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11650 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N][2];

		for (int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());

			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr, (a1, a2) -> {
			if (a1[0] == a2[0]) {
				return a1[1] - a2[1];
			} else {
				return a1[0] - a2[0];
			}
		});

		for (int[] num : arr) {
			sb.append(num[0]).append(" ").append(num[1]).append("\n");
		}

		System.out.println(sb);
	}

	public static void way2() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		String[] sa = new String[N];

		for(int i=0; i<N; i++) {
			sa[i] = br.readLine();
		}

		StringBuilder sb = new StringBuilder();
		Arrays.stream(sa).sorted((s1, s2) -> {
			String[] t1 = s1.split(" ");
			int x1 = Integer.parseInt(t1[0]);
			int y1 = Integer.parseInt(t1[1]);

			String[] t2 = s2.split(" ");
			int x2 = Integer.parseInt(t2[0]);
			int y2 = Integer.parseInt(t2[1]);

			return x1 > x2 ? 1 : x1 == x2 ? y1 > y2 ? 1 : -1 : -1;
		}).forEach(s -> sb.append(s).append("\n"));

		System.out.println(sb);

	}
}
