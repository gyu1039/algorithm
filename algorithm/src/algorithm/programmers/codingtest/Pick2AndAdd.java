package algorithm.programmers.codingtest;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Pick2AndAdd {

	public int[] solution(int[] numbers) {

		Arrays.sort(numbers);
		Set<Integer> set = new TreeSet<>();

		for(int i=0; i<numbers.length-1; i++) {
			int a = numbers[i];

			for(int j = i+1; j<numbers.length; j++) {
				int b = numbers[j];
				if(!set.contains(a+b)) {
					set.add(a+b);
				}
			}

		}

		int[] answer = new int[set.size()];
		Iterator<Integer> i = set.iterator();
		int idx = 0;
		while(i.hasNext()) {
			answer[idx++] = i.next();
		}

		return answer;
	}
}
