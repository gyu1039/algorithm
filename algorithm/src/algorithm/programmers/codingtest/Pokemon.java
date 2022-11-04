package algorithm.programmers.codingtest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Pokemon {

	public int solution(int[] nums) {
		int answer = 0;
		int half = nums.length / 2;

		Map<Integer, Integer> map = new HashMap<>();


		for(int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}

		for(int i=0; i<half; i++) {

			for(int key : map.keySet()) {

				if(map.get(key) != 0 ) {
					answer++;
					map.remove(key);
					break;
				}
			}
		}
		

		return answer;
	}

	public int solution2(int[] nums) {
		return Arrays.stream(nums)
				.boxed()
				.collect(Collectors.collectingAndThen(Collectors.toSet(),
						phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
	}

	public int solution3(int[] nums) {

		Set<Integer> hs = new HashSet<>();
		int nLen = nums.length;
		
		for(int i=0; i<nLen; i++) {
			hs.add(nums[i]);
		}

		if(hs.size() > nLen/2) {
			return nLen/2;
		}
		
		return hs.size();
	}


	
	public static void main(String[] args) {
		
		
	}
}
