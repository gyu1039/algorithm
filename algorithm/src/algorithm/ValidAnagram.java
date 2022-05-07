package algorithm;

import java.util.Arrays;

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {

		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();

		
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		return Arrays.equals(s1, t1);
		
	}
	
	public boolean isAnagram2(String s, String t) {

		int[] s1 = new int[26];

		int sLen = s.length();
		int tLen = t.length();
		
		for(int i=0; i<sLen; i++) s1[s.charAt(i) - 97]++;
		
		for(int i=0; i<tLen; i++) s1[t.charAt(i) - 'a']--;
		
		for(int a : s1)
			if (a != 0) return false;
		
		return true;
	}
}
