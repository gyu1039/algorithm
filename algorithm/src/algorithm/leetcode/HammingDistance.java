package algorithm.leetcode;

public class HammingDistance {
	
	public int hammingDistance(int x, int y) {
		int b = 0;
		int count = 0;
		
		b = x ^ y;
		while(b != 0) {
			b = b & (b-1);
			count++;
		}
		
		return count;
		// Integer.bitCount(result)
	}
}
