package codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveDuplicateLetters {

	public static void main(String[] args) {
		
		System.out.println(removeDuplicateLetters("bcabc"));
	}
	
	
	public static String removeDuplicateLetters(String s) {
		
		char[] var = s.toCharArray();
		
		// 문자열에 있는 각 문자의 개수
		Map<Character, Integer> table = new HashMap<>();
		for(char ch : var) {
			if(!table.containsKey(ch)) table.put(ch, Integer.valueOf(1));
			else table.put(ch, table.get(ch)+ 1);
		}
		
		
		// 스택, 집합 생성
		Set<Character> set = new HashSet<>(); 
		Stack<Character> stack = new Stack<>();
		
		for(char c : var) {
		
			table.put(c, table.get(c) - 1);
//			System.out.println("** "+c + ": " + table.get(c));
			
			if(set.contains(c)) continue;
			
			
			while(!stack.isEmpty() && table.get(stack.peek()) > 0 && c < stack.peek()) {
			//	System.out.println(stack.peek() + ": " + table.get(stack.peek()));
				set.remove(stack.pop());
				
			}
			stack.add(c);
			set.add(c);
			
		}
		
		StringBuffer result = new StringBuffer();
		for(char c : stack) {
			result.append(c);
		}
		
		return result.toString();
		
	}
	
	
}
