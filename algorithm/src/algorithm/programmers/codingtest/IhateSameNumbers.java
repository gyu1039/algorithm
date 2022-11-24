package algorithm.programmers.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IhateSameNumbers {

	public int[] solution(int[] arr) {

		List<Integer> list = new ArrayList<>(arr.length);
		int prev = arr[0];
		list.add(prev);
		for(int i=1; i<arr.length; i++) {

			if(prev == arr[i]) {
				continue;
			}

			prev = arr[i];
			list.add(arr[i]);
		}

		int[] answer = new int[list.size()];
		for(int i=0; i<answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}
