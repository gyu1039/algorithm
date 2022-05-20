package algorithm.leetcode;

import java.util.Arrays;

public class AssignCookies {

	public int findContentChildren(int[] g, int[] s) {

		int greedSize = g.length;
		int contentChildren = s.length;

		if(contentChildren == 0) return 0;
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		int maxNum = 0;
		int i = greedSize - 1, j = contentChildren - 1;
		
		while(i>=0 && j>=0) {
			if(g[i] <= s[j]) {
				maxNum++;
				i--;
				j--;
			} else i--;
		}
		
		return maxNum;
	}
}
