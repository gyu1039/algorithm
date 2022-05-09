package algorithm;

import java.util.Arrays;

public class BinarySearch {

	public int search(int[] nums, int target) {

		int index = Arrays.binarySearch(nums, target);
		return index < 0 ? -1 : index;
	}
}
