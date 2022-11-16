package algorithm.programmers.codingtest;

public class MakingHamburgers {

	public static int solution(int[] ingredient) {

		int result = 0;
		int[] stack = new int[ingredient.length];
		int stackIdx = 0;
		
		for(int i=0; i<ingredient.length; i++) {

			stack[stackIdx] = ingredient[i];
			
			if(stackIdx >= 3 && 
					stack[stackIdx] == 1 &&
					stack[stackIdx-1] == 3 &&
					stack[stackIdx-2] == 2 &&
					stack[stackIdx-3] == 1) {
				stackIdx -= 4;
				result++;
			}
			
			stackIdx++;
		}
			
		
			
		return result;
	}

	public static void main(String[] args) {

		System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));

	}

}

