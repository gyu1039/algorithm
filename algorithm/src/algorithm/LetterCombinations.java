package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	List<String> res = new ArrayList<>();
    Map<Character, String> dict = new HashMap<>();
    String digits;
    
	public List<String> letterCombinations(String digits) {
		
        if(digits == null || digits.length() == 0) return new ArrayList<>();
        
        this.digits = digits;
        
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");
        
        dfs(0, new StringBuilder());
        
		return res;
	}
	
	
	public void dfs(int index, StringBuilder sb) {
		
        if(index == digits.length()) {
            res.add(new String(sb));
            return;
        }
        
        String s = dict.get(digits.charAt(index));
        for(int i=0; i<s.length(); i++) {
            dfs(index + 1, sb.append(s.charAt(i)));
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
}
