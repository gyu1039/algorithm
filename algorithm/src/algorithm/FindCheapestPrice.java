package algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class FindCheapestPrice {


	public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

		Map<Integer, List<int[]>> table = new HashMap<>();

		for(int[] t : flights) {
			int from = t[0];
			int to = t[1];
			int price = t[2];

			if(!table.containsKey(from)) {
				table.put(from, new ArrayList<>());
			}
			table.get(from).add(new int[] {to, price});
		}

		boolean test = false;
		for(List<int[]> t1 : table.values()) {
			for(int[] t2 : t1) {
				if(t2[0] == dst) {
					test = true;
				}
			}
		}

		if(test == false) {
			return -1;
		}

		PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a, int[] b) ->
		a[0] > b[0] ? 1 : -1
				);
		pq.add(new int[] {0, src, k});

		while(pq != null && !pq.isEmpty()) {
			int[] t = pq.poll();
			int price = t[0];
			int from = t[1];
			int K = t[2];

			if(dst == from) {
				return price;
			}

			if(K >= 0) {
				if(table.get(from) != null) {
					for(int[] flight : table.get(from)) {
						int alt = flight[1] + price;
						pq.add(new int[] {alt, flight[0], K - 1});
					}    
				}

			}

		}

		return -1;
	}
	
	public static void main(String[] args) {
		
		
	}

}
