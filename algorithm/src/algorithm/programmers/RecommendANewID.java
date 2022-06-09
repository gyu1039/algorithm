package algorithm.programmers;

public class RecommendANewID {

	public static String solution(String newId) {
        
        // 1단계
        newId = newId.toLowerCase();
        
        // 2단계
        StringBuilder sb = new StringBuilder();
        
        for(char c : newId.toCharArray()) {
        	
        	if(String.valueOf(c).matches("[a-z0-9-_.]")) {
        		sb.append(c);
        	}
        }
        newId = sb.toString();
       
        
        // 3단계
        newId = newId.replaceAll("[.]+", ".");
        
        
        // 4단계
        
        if(newId.length() > 0 && newId.charAt(0) == '.') {
        	newId = newId.substring(1);
        }
        
        if(newId.length() > 0 && newId.charAt(newId.length()-1) == '.') {
        	newId = newId.substring(0, newId.length()-1);
        }
        
        
        
        // 5단계
        if(newId.equals("")) {
        	newId = "a";
        }
        
        
        // 6단계
        
        System.out.println(newId);
        if(newId.length() >= 16) {
        	newId = newId.substring(0, 15);
        	newId = newId.charAt(14) == '.' ? newId.substring(0, 14) : newId; 
        }
        
        System.out.println(newId);
        
        // 7단계
        if(newId.length() <= 2) {
        	int len = newId.length();
        	sb = new StringBuilder(newId);
        	for(int i=len; i<3; i++) {
        		sb.append(sb.charAt(len-1));
        	}
        		
        	newId = sb.toString();
        }
        
        return newId;
    }
	
	public static void main(String[] args) {
		
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
	}
}
