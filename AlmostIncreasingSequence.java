
/***
 * Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].


 * 
 * 
 * 
 * 
 * 
 */

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		int [] sequence = {1, 1};
		System.out.println(solution(sequence));
		

	}
	
	static boolean solution(int[] sequence) {
		if(sequence.length<3) return true;
		
		for(int i= sequence.length-1; i>0; i--) {
			if(sequence[i]<sequence[i-1]) {
				//System.out.println(print(removeArray(sequence, i)) + " "+ print(removeArray(sequence, i-1)));
				if(isSequence(removeArray(sequence, i))) return true;
				if(isSequence(removeArray(sequence, i-1))) return true;
			}
		}
		return false;
		
	}
	
	static String print(int[] sequence) {
		String s="";
		for(int i =0; i<sequence.length; i++) {
			s=s+sequence[i]+", ";
		}
		return s;
	}
	
	static int[] removeArray(int[] sequence, int posi) {
		int[] temp= new int[sequence.length-1];
		int c=0;
		for(int i =0; i<sequence.length; i++) {
			if(i!=posi) {
			temp[c]=sequence[i]; c++;
			}
		}
		return temp;
		
	}
	
	static boolean isSequence(int[] sequence) {
		
		for(int i= sequence.length -1; i>0; i--) {
			
			if(sequence[i] <= sequence[i-1]) {
				return false;}
		}
		return true;
	}
	

}
