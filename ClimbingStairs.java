package solutions;

public class ClimbingStairs {

	public static void main(String[] args) {
		
		System.out.println(solution(26));
	}
	
	
	
	
	
	/*
	 * You are climbing a staircase that has n steps. 
	 * You can take the steps either 1 or 2 at a time. 
	 * Calculate how many distinct ways you can climb to the top of the staircase.
	 * 
	 * 
	 */
	
	public static int solution(int n) {
	
		int[] step= new int[n+1];
		
		if(n==1)return 1;
		if(n==2)return 2;
		
		step[1]=1;
		step[2]=2;
		
		for(int i=3; i<=n; i++) {
			step[i]= step[i-1] + step[i-2];
		}
			
		
		
		return step[n];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
