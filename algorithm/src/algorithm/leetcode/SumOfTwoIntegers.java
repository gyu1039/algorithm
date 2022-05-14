package algorithm.leetcode;

public class SumOfTwoIntegers {

	public int getSum(int a, int b) {

		int mask = 0xFFFFFFFF;
		int intMax = 0x7FFFFFF;

		while(b != 0) {
			int ta = a;
			int tb = b;

			a = (ta ^ tb) & mask;
			b = ((ta & tb) << 1) & mask;
		}

		if(a > intMax)
			a = ~(a ^ mask);

		return a;

	}

	public int recSum(int sum, int carry) {

		if(carry == 0) return sum;
		
		int a = sum ^ carry;
		int b = (sum & carry) << 1;
		
		return recSum(a, b);
	}
}
