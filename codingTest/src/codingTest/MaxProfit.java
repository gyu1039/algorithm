package codingTest;

public class MaxProfit {

	public int maxProfit(int[] prices) {
		
		int profit = 0;
		int minPrice = 10000;
		
		
		for(int price : prices) {
			minPrice = Math.min(price, minPrice);
			profit = Math.max(profit, price - minPrice);
			
		}
		
		
		return profit;
	}
}
