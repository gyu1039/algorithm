package algorithm.leetcode;

import java.util.Stack;

public class Trap {

	public static void main(String[] args) {
		

	}
	
	public int trap1(int[] height) {
		
		Stack<Integer> stack = new Stack<>();
		int volume = 0;
		int count = height.length;
		int top, distance, waters;
	
		for(int i=0; i<count; i++) {
			
			while(!stack.empty() && height[i] > height[stack.peek()]) {
				top = stack.pop();
				
				if(stack.empty()) break;
				
				distance = i - stack.peek() - 1;
				waters = Math.min(height[i], height[stack.peek()]) - height[top];
				
				volume += distance * waters;		
			}
			
			stack.push(i);
		}
		
		return volume;
	}
	
	public int trap2(int[] height) {
		
		if(height.length==0) return 0;

		int volume = 0;
		
		int left = 0, right = height.length - 1;
		int leftMax = height[left], rightMax = height[right];
		
		while(left < right) {
			
			leftMax = Math.max(height[left], leftMax);
			rightMax = Math.max(height[right], rightMax);
			
			if(leftMax <= rightMax) {
				volume += leftMax - height[left];
				left++;	
			} else {
				volume += rightMax - height[right];
				right--;
			}
		}
		
		return volume;
		
		
	}

}
