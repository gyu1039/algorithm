package algorithm.programmers.codingtest;

public class CaesarPassword {

	public String solution(String s, int n) {

		StringBuilder sb = new StringBuilder();

		for(int i=0; i<s.length(); i++) {

			char c = s.charAt(i);
			if(c == ' '){
				sb.append(" ");
			} else if('a' <= c && c <= 'z') {
				sb.append((char)(97 + (c - 97 + n) % 26));
			} else {
				sb.append((char)(65 + (c - 65 + n) % 26));
			}

		}

		return sb.toString();
	}

}
