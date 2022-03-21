package codingTest;

public class NumIslands {
	
	public char[][] grid;
	
	public int numIslands(char[][] grid) {
	
		this.grid = grid;
		
		int count = 0;
		
		for(int i=0; i < grid.length; i++) {
			for(int j=0; j < grid[0].length; j++) {
				if(grid[i][j] == '1') {
					dfs(i, j);
					count++;	
				}
			}
		}
		
		return count;
	}
	
	public void dfs(int i, int j) {
			
		if( i < 0 || i >= grid.length
				|| j < 0 || j >= grid[0].length
				|| grid[i][j] != '1') {
			return;
		}
		
		grid[i][j] = 0;
		
		dfs(i+1, j);
		dfs(i-1, j);
		dfs(i, j+1);
		dfs(i, j-1);
	}
}
