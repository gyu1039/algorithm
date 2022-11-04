package algorithm.programmers.codingtest;

import java.util.ArrayList;
import java.util.List;

public class CreatingAPrimeNumber {

	public static int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;

        int count = 0;
        for(int i=0; i<len-2; i++) {
        	for(int j=i+1; j<len-1; j++) {
        		for(int k=j+1; k<len; k++) {
        			answer += eratos(nums[i], nums[j], nums[k]);
        			
        			count++;
        		}
        	}
        }

        
        System.out.println("count = " + count);
        return answer;
    }
	
	public static int eratos(int n1, int n2, int n3) {
		
		int num = n1 + n2 + n3;
		
		if(num <= 1) {
			return 0;
		}
		
		for(int i=2; i <= (int) Math.sqrt(num); i++) {
			if(num % i == 0) {
				return 0;
			}
		}
	
		System.out.println(num);
		return 1;
	}
			
	public static void main(String[] args) {
		
		solution(new int[] {1,2,3,4});
	}
}
