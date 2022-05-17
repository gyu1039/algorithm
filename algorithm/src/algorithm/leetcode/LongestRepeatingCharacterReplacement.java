package algorithm.leetcode;

public class LongestRepeatingCharacterReplacement {
	
	public int characterReplacement(String s, int k) {
		
		int sSize = s.length();
		int[] count = new int[26];
		int maxCount = 0;
		int maxLength = 0;
		
		int left = 0;
		
		for(int right=0; right < sSize; right++) {
			int idx = s.charAt(right) - 'A';
			
			count[idx] += 1;
			maxCount = Math.max(maxCount, count[idx]);
			
			// right - left + 1 = size of  current window
			// maxCount = largest count of a single, unique character in the current window
			while(right - left + 1 - maxCount > k) {
				count[s.charAt(left) -'A'] -= 1;
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		
		return maxLength;
	}
}
