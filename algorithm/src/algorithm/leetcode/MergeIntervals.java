package algorithm.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

	public int[][] merge(int[][] intervals) {

		List<int[]> result = new ArrayList<>();
		Arrays.sort(intervals, 
				(int[] a, int[] b) -> a[0] < b[0] ? -1 : 
					a[0] == b[0] ? 0 : 1);

		result.add(new int[] {intervals[0][0], intervals[0][1]});

		for(int i = 1; i<intervals.length; i++) {
			int v1 = intervals[i][0];
			int v2 = intervals[i][1];
			int[] existed = result.get(result.size() - 1);
			if(existed[1] >= v1) {
				existed[1] = Math.max(existed[1], v2);
			} else {
				result.add(new int[] {v1, v2});
			}
		}
		return result.toArray(new int[result.size()][2]);
	}
}
