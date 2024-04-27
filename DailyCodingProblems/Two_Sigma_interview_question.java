/*
 * his problem was asked by Two Sigma.

Using a function rand5() that returns an integer from 1 to 5 (inclusive) with uniform probability, 
implement a function rand7() that returns an integer from 1 to 7 (inclusive).
 * 
 * 
 * 
 */

package DailyCodingProblems;

import java.util.ArrayList;
import java.util.Random;

public class Two_Sigma_interview_question {

	public static void main(String[] args) {
		rand7();

	}

	private static void rand7() {
		//In order to get uniform probability
		ArrayList<Boolean> list= new ArrayList<Boolean>();
		//mark all to be false
		for(int i=0; i<7; i++) {
			list.add(false);
		}
		int count=0;
		while (count<8) {
			Random rand= new Random();
			
			int x= rand.nextInt((6 - 0)+1);
				
			//hasen't return that value
			if(list.get(x) == false ) {
				System.out.print(x+1 +" "+list.get(x)  +", ");
				list.set(x, true);
				count++;
				System.out.println(list.toString());
			}
		
		
		}
}
	
	
	
	
}