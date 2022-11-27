package algorithm.programmers.codingtest;

public class MinimumRectangle {

	public int solution(int[][] sizes) {

		int maxWidth = 0;
		int maxHeight = 0;

		for(int i=0; i<sizes.length; i++) {

			int[] ar = sizes[i];
			for(int j=0; j<2; j++) {

				if(ar[0] < ar[1]) {
					int tmp = ar[0];
					ar[0] = ar[1];
					ar[1] = tmp;
				}

				if(maxWidth < ar[0]) {
					maxWidth = ar[0];
				}

				if(maxHeight < ar[1]) {
					maxHeight = ar[1];
				}

			}
		}


		return maxWidth * maxHeight;
	}
}
