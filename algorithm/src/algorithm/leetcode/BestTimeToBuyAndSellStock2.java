package algorithm.leetcode;

public class BestTimeToBuyAndSellStock2 {
	public int maxProfit(int[] prices) {

		int result = 0;
		int size = prices.length;
		
		for(int i=0; i<size-1; i++) {
			if(prices[i+1] > prices[i]) {
				result += prices[i+1] - prices[i];
			}
		}
		return result;
	}
}
