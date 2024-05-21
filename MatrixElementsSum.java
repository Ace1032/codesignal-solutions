
/**
 * After becoming famous, the CodeBots decided to move into a new building together.
 *  Each of the rooms has a different cost, and some of them are free, but there's a 
 *  rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious,
 *   they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, 
your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all 
the values that don't appear below a 0).

Example

For

matrix = [[0, 1, 1, 2], 
          [0, 5, 0, 0], 
          [2, 0, 3, 3]]
the output should be
solution(matrix) = 9.
 * 
 * 
 * 
 * 
 * 
 */

public class MatrixElementsSum {

	public static void main(String[] args) {
		int [][] matrix = {{0, 1, 1, 0}, 
		          			{0, 5, 0, 1}, 
		          			{2, 0, 3, 3}};
		System.out.println("count is "+solution(matrix));

	}
	
	
	public static int solution(int[][] matrix) {
		int count=0;
		for(int y=0; y < matrix.length; y++) {
			for(int x=0; x<matrix[y].length; x++) {
				if(matrix[y][x]>0) {
					if(!isGhost(x, y-1, matrix)) {
						count=count+ matrix[y][x];
						
					}
				}
			}
			System.out.println();
		}
		return count;

	}
	
	public static boolean isGhost(int x, int y, int[][] matrix) {
		
		while(y>=0) {
		if(matrix[y][x]== 0) return true;
		y--;
		}
		
		return false;
	}

}
