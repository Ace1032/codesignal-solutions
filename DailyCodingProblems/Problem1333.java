
/***
 * 
 * 
 * This problem was asked by Slack.

You are given an N by M matrix of 0s and 1s. Starting from the top left corner, how many ways are there to reach the bottom right corner?

You can only move right and down. 0 represents an empty space while 1 represents a wall you cannot walk through.

For example, given the following matrix:

[[0, 0, 1],
 [0, 0, 1],
 [1, 0, 0]]
Return two, as there are only two ways to get to the bottom right:

Right, down, down, right
Down, right, down, right
The top left corner and bottom right corner will always be 0.
 * 
 * 
 */




public class Problem1333 {

	public static void main(String[] args) {
		int[][] metx= {
			    {0, 0, 0, 0},
			    {0, 1, 1, 0},
			    {0, 0, 0, 0},
			    {0, 1, 0, 0}
			};
		
		FindPath f=new FindPath(metx);
		
		
	}

}

class FindPath{
	
	int[][] metx;
	int win_x=0, win_y=0;
	int count=0;
	
	public FindPath(int[][] metx) {
		setArray(metx);
		setWinPonts();
		findParth();
	}
	public void setArray(int[][] metx) {
		this.metx= new int [metx.length][metx[0].length];
		for(int i=0; i< metx.length; i++) {
			for(int j=0; j<metx[0].length; j++) {
				this.metx[i][j]=metx[i][j];
			}
		}
	}
	
	class node {
		node path=null;
		int x=0;
		int y=0;
		
		public node(int x, int y) {
			this.x=x; this.y=y;
		}
	}
	
	public void setWinPonts() {
		win_x= metx[0].length-1;
		win_y=metx.length-1;
	}
	private boolean checkWin(int x, int y) {
		if(x== win_x && y==win_y) return true;
		return false;
	}
	
	public boolean checkBoundry(int x, int y) {
		if(x>win_x || y>win_y ) {return false;}
		if(metx[x][y] == 0) return true;
		return false;
	}
	
	public void findParth() {
		node n=new node(0,0);
		path(n);
		System.out.println(count);
		
	}
	private void path(node n) {
		if(checkWin(n.x, n.y) ) {
			count++;
		}
		
		
		if(checkBoundry(n.x+1, n.y)) {
			n.path=new node(n.x+1, n.y);
			path(n.path);
			}
		if(checkBoundry(n.x, n.y+1)) {
			n.path=new node(n.x, n.y+1);
			path(n.path);
			}
		
	}
	
	
	
}
