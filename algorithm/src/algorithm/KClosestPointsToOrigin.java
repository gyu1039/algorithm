package algorithm;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

	public int[][] kClosest(int[][] points, int k) {

		int lenPoints = points.length;
		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[0] > b[0] ? 1 : -1);
		int[][] result = new int[k][];
		
		for(int i = 0; i<lenPoints; i++) {
			int x = points[i][0];
			int y = points[i][1];
			pq.add(new int[] {x*x + y*y ,i, x,y });
		}
		
		for(int i = 0; i<k; i++) {
			int[] a = pq.poll();
			result[i] = new int[] {a[2], a[3]};
		}
		
		return result;
	}
	
}
