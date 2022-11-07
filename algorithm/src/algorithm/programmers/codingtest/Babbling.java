package algorithm.programmers.codingtest;

public class Babbling {

	public static int solution(String[] babbling) {
		
		int answer = 0;
		
		for(String s : babbling) {
			
			String t = s.replaceAll("aya", "1").replaceAll("ye", "2").replaceAll("woo", "3").replaceAll("ma", "4");
			int len = t.length();
			int prev = t.charAt(0) - '0';
			
			if(!(1 <= prev && prev <= 4)) {
				continue;
			}
			
			if(len == 1) {
				answer++;
				continue;
			}
			
			for(int i=1; i<len; i++) {
				int cur = t.charAt(i) - '0';
				
				if(!(1 <= cur && cur <= 4) || prev == cur) {
					break;
				}
				prev = cur;
				
				if(i == len-1) {
					answer++;
				}
			}
			
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution(new String[] {"aya", "yee", "u", "maa"}));
		
	}
	
}
