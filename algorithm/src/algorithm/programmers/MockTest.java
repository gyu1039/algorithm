package algorithm.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockTest {


	public int[] solution1(int[] answers) {
		
		int len = answers.length;
		List<Integer> l = new ArrayList<>();
		
		Map<String, Integer> map = new HashMap<>();
		map.put("1", 0);
		map.put("2", 0);
		map.put("3", 0);
		
		for(int i=0; i<len; i++) {
			
			map.put("1", map.get("1") + (aGiver1(i) == answers[i] ? 1 : 0));
			map.put("2", map.get("2") + (aGiver2(i) == answers[i] ? 1 : 0));
			map.put("3", map.get("3") + (aGiver3(i) == answers[i] ? 1 : 0));
		}
		
		int max = Collections.max(map.values());
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			if(e.getValue() == max) {
				l.add(Integer.valueOf(e.getKey()));
			}
		}
		
		return l.stream().mapToInt(i->i).toArray();
	}

	public int aGiver1(int index) {

		switch(index % 5) {
		case 0:
			return 1;
		case 1:
			return 2;
		case 2:
			return 3;
		case 3:
			return 4;
		case 4:
			return 5;
		}

		return 0;
	}

	public int aGiver2(int index) {

		if(index % 2 == 0) {

			return 2;
		} 

		switch(index % 8) {
		case 1:
			return 1;
		case 3:
			return 3;
		case 5:
			return 4;
		case 7:
			return 5;
		}

		return 0;
	}

	public int aGiver3(int index) {

		switch(index % 10) {
		case 0:
		case 1:
			return 3;
		case 2:
		case 3:
			return 1;
		case 4:
		case 5:
			return 2;
		case 6:
		case 7:
			return 4;
		case 8:
		case 9:
			return 5;
		}
		
		return 0;
	}
	
	public int[] solution(int[] answer) {
		
		int len = answer.length;
		
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int aLen = a.length;
        int bLen = b.length;
        int cLen = c.length;
        
        int[] score = new int[3];
        
        for(int i=0; i<len; i++) {
        	
            if(answer[i] == a[i%aLen]) {score[0]++;}
            if(answer[i] == b[i%bLen]) {score[1]++;}
            if(answer[i] == c[i%cLen]) {score[2]++;}
        }
        
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        
        int lSize = list.size();
        int[] ans = new int[lSize];
        
        for(int i=0; i<lSize; i++) {
        	ans[i] = list.get(i); 
        }
        
        
        return ans;
    }
}
