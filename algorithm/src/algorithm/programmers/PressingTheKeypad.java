package algorithm.programmers;

public class PressingTheKeypad {

	int[][] numpadPos = {
			{0, 0},
			{-1, 3},
			{0, 3},
			{1, 3},
			{-1, 2},
			{0, 2},
			{1, 2},
			{-1, 1},
			{0, 1},
			{1, 1}
	};

	int[] leftPos = {-1, 0};
	int[] rightPos = {1, 0};
	
	public String solution(int[] numbers, String hand) {

		StringBuilder sb = new StringBuilder();

		for(int i : numbers) {

			String s = IdentifyingThumb(i, hand);
			sb.append(s);
			
			if(s.equals("L")) leftPos = numpadPos[i];
			else rightPos = numpadPos[i];
		}

		return sb.toString();
	}

	public int calcDistance(int[] target, int num) {

		return Math.abs(target[0] - numpadPos[num][0]) + Math.abs(target[1] - numpadPos[num][1]);
	}

	
	public String IdentifyingThumb(int num, String hand) {

		String ret = hand.equals("right") ? "R" : "L";

		if(num == 1 || num == 4 || num ==7) ret = "L";
		else if(num == 3 || num == 6 || num == 9) ret = "R";
		else {
			int leftDistance = calcDistance(leftPos, num);
			int rightDistance = calcDistance(rightPos, num);
			
			if(leftDistance > rightDistance) ret = "R";
			else if(leftDistance < rightDistance) ret = "L";
		}
		
		
		return ret;
	}



}
