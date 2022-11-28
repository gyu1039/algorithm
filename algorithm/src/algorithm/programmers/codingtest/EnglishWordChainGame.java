package algorithm.programmers.codingtest;

import java.util.HashSet;
import java.util.Set;

public class EnglishWordChainGame {

	public int[] solution(int n, String[] words) {

		int cnt = 0;
		int nth = 1;
		Set<String> set = new HashSet<>();
		String prev = words[0];
		set.add(prev);

		for(int i=1; i<words.length; i++) {
			String cur = words[i];
			nth = nth % n + 1;
			cnt = i / n + 1;

			if(prev.charAt(prev.length() - 1) != cur.charAt(0)
					|| set.contains(cur)) {
				return new int[] {nth, cnt};
			}
			prev = cur;
			set.add(cur);
		}

		return new int[] {0, 0};
	}
}
