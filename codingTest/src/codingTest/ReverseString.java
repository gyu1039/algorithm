package codingTest;

public class ReverseString {

	public void reverseString(char[] s) {
		int left = 0, right = s.length-1;
		char tmp;
		
		while(left < right) {
			tmp = s[left];
			s[left] = s[right];
			s[right] = tmp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		

	}

}
