package algorithm.baekjoon._1to9999;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class _1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> leftCursor = new Stack<>();
		Stack<Character> rightCursor = new Stack<>();

		String init = br.readLine();
		int len = init.length();
		for(int i=0; i<len; i++) {
			leftCursor.push(init.charAt(i));
		}

		int M = Integer.parseInt(br.readLine());
		for(int i=0; i<M; i++) {

			String s = br.readLine();

			if(s.startsWith("P")) {
				leftCursor.push(s.charAt(2));

			} else if(s.equals("L")) {
				if(!leftCursor.isEmpty()) {
					
					rightCursor.push(leftCursor.pop());
				}

			} else if(s.equals("D")) {
				if(!rightCursor.isEmpty()) {
					leftCursor.push(rightCursor.pop());
				}

			} else if(s.equals("B")) {
				if(!leftCursor.isEmpty()) {
					leftCursor.pop();
				}
			}

		}
		
		while(!leftCursor.isEmpty()) {
			rightCursor.push(leftCursor.pop());
		}
		
		StringBuilder sb = new StringBuilder();

		while(!rightCursor.isEmpty()) {
			sb.append(rightCursor.pop());
		}

		System.out.println(sb);

	}

	public static void way1() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Character> linkedList = new LinkedList<>();
		String init = br.readLine();
		int M = Integer.parseInt(br.readLine());

		for(char c : init.toCharArray()) {
			linkedList.add(c);
		}

		ListIterator<Character> iter = linkedList.listIterator();
		while(iter.hasNext()) {
			iter.next();
		}

		while(M-- > 0) {
			String s = br.readLine();

			if(s.startsWith("P")) {
				iter.add(s.charAt(2));

			} else if(s.equals("L")) {
				if(iter.hasPrevious()) {
					iter.previous();
				}

			} else if(s.equals("D")) {
				if(iter.hasNext()) {
					iter.next();
				}

			} else if(s.equals("B")) {
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
			}
		}

		StringBuilder sb=  new StringBuilder();
		for(char c : linkedList) {
			sb.append(c);
		}

		System.out.println(sb);
	}
}
