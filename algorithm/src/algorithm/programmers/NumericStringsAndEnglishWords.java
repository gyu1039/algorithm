package algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

public class NumericStringsAndEnglishWords {

	public int solution(String s) {
		
		
		Map<String, Integer> table = new HashMap<>();
		
		table.put("zero", 0);
		table.put("one", 1);
		table.put("two", 2);
		table.put("three", 3);
		table.put("four", 4);
		table.put("five", 5);
		table.put("six", 6);
		table.put("seven", 7);
		table.put("eight", 8);
		table.put("nine", 9);

		for(String numericNumber : table.keySet()) {
			if(s.contains(numericNumber)) {
				s= s.replaceAll(numericNumber, table.get(numericNumber) + "");
			}
		}
		
		return Integer.parseInt(s);
	}
}
