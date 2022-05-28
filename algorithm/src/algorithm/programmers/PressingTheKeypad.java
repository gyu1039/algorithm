package algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class PressingTheKeypad {

	public String solution(int[] numbers, String hand) {

		StringBuilder sb = new StringBuilder();
		
		Map<Integer, int[]> map = new HashMap<>();
		map.put(2, new int[] {0, 3});
		map.put(5, new int[] {0, 2});
		map.put(8, new int[] {0, 1});
		map.put(0, new int[] {0, 0});
		
		int[][] currentPosition = new int[2][2];
		currentPosition[0] = new int[] {-1, 0};
		currentPosition[1] = new int[] {1, 0};
		
		for(int i : numbers) {
			
			switch(i) {
				case 1:
					currentPosition[0][0] = -1;
					currentPosition[0][1] = 3;
					sb.append("L");
					break;
				case 4:
					currentPosition[0][0] = -1;
					currentPosition[0][1] = 2;
					sb.append("L");
					break;
				case 7:
					currentPosition[0][0] = -1;
					currentPosition[0][1] = 1;
					sb.append("L");
					break;
					
				case 3:
					currentPosition[1][0] = 1;
					currentPosition[1][1] = 3;
					sb.append("R");
					break;
				case 6:
					currentPosition[1][0] = 1;
					currentPosition[1][1] = 2;
					sb.append("R");
					break;
				case 9:
					currentPosition[1][0] = 1;
					currentPosition[1][1] = 1;
					sb.append("R");
					break;
			
				
				case 2:
					sb.append(centerColumn(currentPosition, map.get(2), hand));
					break;
				case 5:
					sb.append(centerColumn(currentPosition, map.get(5), hand));
					break;
				case 8:
					sb.append(centerColumn(currentPosition, map.get(8), hand));
					break;
				case 0:
					sb.append(centerColumn(currentPosition, map.get(0), hand));
					break;
			}

		}

		return sb.toString();
	}
	
	public String centerColumn(int[][] currentPosition, int[] target, String hand) {
		
		String ret = null;
		
		int leftX = currentPosition[0][0];
		int leftY = currentPosition[0][1];
		int rightX = currentPosition[1][0];
		int rightY = currentPosition[1][1];
		
		int leftTargetDistance = abs(leftX - target[0]) + abs(leftY - target[1]);
		int rightTargetDistance = abs(rightX - target[0]) + abs(rightY - target[1]);;

		if(leftTargetDistance == rightTargetDistance) {
			if(hand.equals("left")) {
				currentPosition[0][0] = target[0];
				currentPosition[0][1] = target[1];
				ret = "L";
			} else if(hand.equals("right")) {
				currentPosition[1][0] = target[0];
				currentPosition[1][1] = target[1];
				ret = "R";
			}
			
			
		} else if(leftTargetDistance < rightTargetDistance) {
			currentPosition[0][0] = target[0];
			currentPosition[0][1] = target[1];
			ret = "L";
		} else if(leftTargetDistance > rightTargetDistance){
			currentPosition[1][0] = target[0];
			currentPosition[1][1] = target[1];
			ret = "R";
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(Math.min(1, 2));
	}
}
