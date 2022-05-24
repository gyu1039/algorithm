package algorithm.programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ReceiveReportResults {


	public static int[] solution(String[] id_list, String[] report, int k) {

		int[] answer = new int[id_list.length];

		Map<String, Integer> c = new HashMap<String, Integer>();
		Map<String, Set<String>> reportedIdSet = new HashMap<>();

		for(String id : report) {
			String[] t = id.split(" ");
			String reporter = t[0];
			String reported = t[1];

			// 신고 당한 사람 - 신고한 사람
			if(reportedIdSet.get(reported) == null) reportedIdSet.put(reported, new HashSet<>());
			reportedIdSet.get(reported).add(reporter);
		}

		for(String id : id_list) {
			if(reportedIdSet.get(id) != null && reportedIdSet.get(id).size() >= k) {
				for(String s : reportedIdSet.get(id)) {
					c.put(s, c.getOrDefault(s, 0) + 1);
				}
			}
		}

		int i =0;
		for(String id : id_list) {
			if(c.get(id) != null)
				answer[i++] = c.get(id);
			else answer[i++] = 0;
		}

		return answer;
	}

	public static int[] solution2(String[] id_list, String[] report, int k) {

		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());
		HashMap<String, Integer> count = new HashMap<>();
		for (String s : list) {
			String target = s.split(" ")[1];
			count.put(target, count.getOrDefault(target, 0) + 1);
		}

		return Arrays.stream(id_list).map(_user -> {
			final String user = _user;
			List<String> reportList = list.stream().filter(s -> s.startsWith(user + " ")).collect(Collectors.toList());
			return reportList.stream().filter(s -> count.getOrDefault(s.split(" ")[1], 0) >= k).count();
		}).mapToInt(Long::intValue).toArray();
	}
	
	public static void main(String[] args) {
		
		String[] idList = new String[]{"a","frodo"};
		String[] report = new String[]{"abc frodo"};
		
		Arrays.stream(idList).map(_user -> {
			return Arrays.stream(report).filter(s -> s.startsWith(_user)).collect(Collectors.toList());
			
		}).forEach(System.out::println);
		
		
		
		
	}

	
}
