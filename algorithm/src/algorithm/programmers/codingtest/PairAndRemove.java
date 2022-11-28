package algorithm.programmers.codingtest;

public class PairAndRemove {

	public int solution(String s) {

		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		for(int i=1; i<s.length(); i++) {
			if(sb.length() > 0 && s.charAt(i) == sb.charAt(sb.length() - 1)) {
				sb.deleteCharAt(sb.length() - 1);
				continue;
			}
			sb.append(s.charAt(i));
		}

		return sb.length() == 0 ? 1 : 0;
	}
}
