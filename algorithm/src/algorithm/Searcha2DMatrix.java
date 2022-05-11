package algorithm;

public class Searcha2DMatrix {
	
	public boolean searchMatrix(int[][] matrix, int target) {
		
		int row = 0;
		int col = matrix[row].length - 1;
		
		while(row < matrix.length && col >= 0) {
			if(target == matrix[row][col]) return true;
			else if(target < matrix[row][col]) col--;
			else row++;
		}
		
		return false;
	}
}
