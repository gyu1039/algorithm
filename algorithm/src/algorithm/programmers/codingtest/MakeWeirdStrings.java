package algorithm.programmers.codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeWeirdStrings {

	class Solution {
		public String solution(String s) {

			int len = s.length();
			StringBuilder sb = new StringBuilder();

			int num = 0;
			for(int j=0; j<len; j++) {
				char c = s.charAt(j);

				if(c == ' ') {
					num = 0;
					sb.append(' ');
					continue;
				}


				if(num % 2 == 0) {
					sb.append(Character.toUpperCase(c));
				} else {
					sb.append(Character.toLowerCase(c));
				}
				num++;
			}

			return sb.toString();
		}
	}
}


