package algorithm.programmers;

import java.util.Arrays;

public class AnIncompleteRunner {

	public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        int len = completion.length;
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i=0; i<len; i++) {
        	if(!participant[i].equals(completion[i])) {
        		answer = participant[i];
        		break;
        	}
        }
        
        return answer = answer.equals("") ? participant[len] : answer;
    }
	
	public static void main(String[] args) {
		
		System.out.println("".equals(""));
	}
}
