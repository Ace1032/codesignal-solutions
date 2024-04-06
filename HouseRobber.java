package solutions;

import java.util.HashMap;

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums= {1,2,1,1};
		
		
		System.out.println(solution(nums));

	}
	
	/*
	 * You are planning to rob houses on a specific street, and you know that every house on the street has a certain amount of money hidden. 
	 * The only thing stopping you from robbing all of them in one night is that adjacent houses on the street have a connected security system. 
	 * The system will automatically trigger an alarm if two adjacent houses are broken into on the same night.
	 * Given a list of non-negative integers nums representing the amount of money hidden in each house, determine the maximum amount of money 
	 * you can rob in one night without triggering an alarm.
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static int solution(int[] nums) {
		if(nums.length==0) return 0;
		if(nums.length==1) return nums[0];
		if(nums.length==2) {
			if(nums[0]>nums[1]) return nums[0];
			else return nums[1];
		}
		int big=0;
		int big2=0;
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		HashMap<Integer, Integer> map2=new HashMap<Integer,Integer>();
		
		big=nums[0]; map.put(1, big);
		if(nums[0]>nums[1]) { big=nums[0]; map.put(2, big);} else {big=nums[1]; map.put(2, big);} 
		if((nums[0]+nums[2]) >nums[1]) {big=(nums[0]+nums[2]);map.put(3, big);} else {big=nums[1];map.put(3, big);} 
		
		for(int i=3; i<nums.length; i++) {
			
			int l=0;
			int r= nums[i] + map.get(i-1);
			
			if(map.get(i-2)!=null) {
			l= nums[i-1] + map.get(i-2);
			}
			if(r>l) {big =r; map.put(i+1, r);}
			else {big =l; map.put(i+1, l);}
			
		}
		

		return big;
	}
		
	

}
