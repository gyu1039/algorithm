package algorithm.leetcode;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ReorderLogFiles {

	public String[] reorderLogFiles(String[] logs) {

		List<String> letterLogs = new ArrayList<>();
		List<String> digitLogs = new ArrayList<>();

		for (String log : logs) {
			String[] tokens = log.split(" ");
			if (tokens[1].matches("^[0-9]*$")) {
				digitLogs.add(log);
			} else {
				letterLogs.add(log);
			}
		}

		Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String string1, String string2) {
				int comp = string1.substring(string1.indexOf(" ")).compareTo(string2.substring(string2.indexOf(" ")));
				if (comp == 0) {
					return string1.compareTo(string2);
				}
				return comp;
			}
		};

		Collections.sort(letterLogs, comparator);
		letterLogs.addAll(digitLogs);

		return letterLogs.toArray(new String[logs.length]);			
	}

	public static void main(String[] args) {





	}
}
