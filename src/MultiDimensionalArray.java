
public class MultiDimensionalArray {
	public static void main(String[] args) {
		
		int[][] grid = {
				{3, 4, 5},
				{2, 21},
				{22, 07, 16}
		};
		
		for(int row = 0; row < grid.length; row++) {
			for(int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col] + "\t");
			}
			
			System.out.println();
		}

	}
}
