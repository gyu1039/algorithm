package algorithm.leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		
		System.out.println(isValid1("()"));
		
	}
	
	public static boolean isValid1(String s) {
		
		Map<String, String> table = new HashMap<>();
		Stack<String> stack = new Stack<>(); 
		
		table.put(")", "(");
		table.put("}", "{");
		table.put("]", "[");
		
		String[] array = s.split("");
		
		for(String parentheses : array) {
			
			if(!table.containsKey(parentheses)) {
				stack.push(parentheses);				
			} else if (stack.isEmpty() || !((table.get(parentheses)).equals(stack.pop())) )  {
				return false;
			}
			
		}
		
		return stack.size() == 0;
	}
	
	public static boolean isValid2(String s) {

		Map<Character, Character> table = new HashMap<>();
		Stack<Character> stack = new Stack<>(); 

		table.put(')', '(');
		table.put('}', '{');
		table.put(']', '[');

		char[] array = s.toCharArray();

		for(char parentheses : array) {

			if(!table.containsKey(parentheses)) {
				stack.push(parentheses);
				System.out.println(parentheses);

			} else if (stack.isEmpty() || (table.get(parentheses)).compareTo(stack.pop()) != 0)  {
				System.out.println();
				return false;
			}

		}

		return stack.size() == 0;
	}
}
