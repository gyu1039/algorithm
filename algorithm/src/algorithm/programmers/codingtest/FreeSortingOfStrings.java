package algorithm.programmers.codingtest;

import java.util.Arrays;
import java.util.Comparator;

public class FreeSortingOfStrings {

	public String[] solution(String[] strings, int n) {


		Node[] ar = new Node[strings.length];

		for(int i=0; i<strings.length; i++) {
			ar[i] = new Node(i, strings[i], strings[i].charAt(n));
		}

		Arrays.sort(ar);
		String[] answer = new String[strings.length];
		for(int i=0; i<answer.length; i++) {
			answer[i] = ar[i].s;
		}

		return answer;
	}

	static class Node implements Comparable<Node>{

		int index;
		String s;
		char nth;

		public Node(int index, String s, char nth) {
			this.index = index;
			this.s = s;
			this.nth = nth;
		}

		@Override
		public int compareTo(Node o) {

			return this.nth > o.nth ? 1 :
				this.nth == o.nth ? this.s.compareTo(o.s) : -1;
		}


	}

	public String[] way2(String[] strings, int n) {
		
		Arrays.sort(strings, new Comparator<String>(){
	          @Override
	          public int compare(String s1, String s2){
	              if(s1.charAt(n) > s2.charAt(n)) return 1;
	              else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
	              else if(s1.charAt(n) < s2.charAt(n)) return -1;
	              else return 0;
	          }
	      });
	      return strings;
	}

}
