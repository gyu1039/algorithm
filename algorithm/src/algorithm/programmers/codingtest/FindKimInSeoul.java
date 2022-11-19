package algorithm.programmers.codingtest;

public class FindKimInSeoul {

	public String solution(String[] seoul) {

		int x = 0;
		for(String e : seoul) {

			if(e.equals("Kim")) {
				break;
			}
			x++;
		}

		return "김서방은 " + x + "에 있다";
	}
}
