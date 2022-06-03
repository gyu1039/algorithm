package algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnIncompleteRunner {

	public String solution1(String[] participant, String[] completion) {
		String answer = "";

		int len = completion.length;

		Arrays.sort(participant);
		Arrays.sort(completion);

		for(int i=0; i<len; i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}

		return answer = answer.equals("") ? participant[len] : answer;
	}

	public String solution(String[] participant, String[] completion) {

		String answer = "";
		Map<String, Integer> table = new HashMap<>();
		
		for(String p : participant) {
			table.put(p, table.getOrDefault(p, 0) + 1);
		}
		
		for(String c : completion) 
			table.put(c, table.get(c) - 1);
		
		for(Map.Entry<String, Integer> entry : table.entrySet()) {
			if(entry.getValue() > 0) 
				answer = entry.getKey(); 
		}
		
		
		return answer;
	}

	public static void main(String[] args) {

	}
}
