package algorithm.programmers.codingtest;

import java.util.LinkedList;

public class Cache {

	public int solution(int cacheSize, String[] cities) {

		int answer = 0;
		LinkedList<String> q = new LinkedList<>();

		for(String city : cities) {
			city = city.toLowerCase();
			
			if(q.size() <= cacheSize && q.contains(city)) {
				answer += 1;
				q.add(q.remove(q.indexOf(city)));
				continue;
			}
			
			if(q.size() == cacheSize) {
				q.poll();
			}
			q.add(city);
			answer += 5;
		}

		return answer;
	}
}
