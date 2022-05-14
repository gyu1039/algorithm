package algorithm.leetcode;

public class UTF8Validation {

	public boolean validUtf8(int[] data) {
		
		int start = 0;
		
		while(start < data.length) {
			int first = data[start];
			if((first >>> 3) == 0b11110 && check(3, start, data)) {
				start += 4;
			} else if((first >>> 4) == 0b1110 && check(2, start, data)) {
				start += 3;
			} else if((first >>> 5) == 0b110 && check(1, start, data)) {
				start += 2;
			} else if((first >>> 7) == 0) {
				start += 1;
			} else 
				return false;
			
		}
		
		return true;
	}
	
	private boolean check(int size, int start, int[] data) {
		for(int i = start + 1; i < size + start + 1; i++) {
			if(i >= data.length || (data[i] >> 6) != 0b10) 
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
	}
}
