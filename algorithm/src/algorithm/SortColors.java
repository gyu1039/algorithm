package algorithm;

public class SortColors {

	public void sortColors(int[] nums) {

		int red = 0;
		int white = 0;
		int blue = nums.length;
		
		while(white < blue) {
			if(nums[white] < 1) {
				int tmp;
				tmp = nums[red];
				nums[red] = nums[white];
				nums[white] = tmp;
				red++;
				white++;
			}
			else if(nums[white] > 1) {
				blue--;
				int tmp;
				tmp = nums[white];
				nums[white] = nums[blue];
				nums[blue] = tmp;
			}
			else {
				white++;
			}
		}
	}
}
