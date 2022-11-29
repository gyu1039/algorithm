package algorithm.programmers.codingtest;

public class CreatingJadenCaseStrings {

	public String solution(String s) {

		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);

			if(c == ' ') {
				sb.append(' ');
				isFirst = true;
				continue;
			}

			if(isFirst && ('0' < c && c <'9')) {
				sb.append(c);
				isFirst = false;

			} else if(isFirst) {
				sb.append(Character.toUpperCase(c));
				isFirst = false;

			} else if(!isFirst && ('0' < c && c <'9')) {
				sb.append(c);

			} else if(!isFirst) {
				sb.append(Character.toLowerCase(c));   
			}
		}

		return sb.toString();
	}
}
