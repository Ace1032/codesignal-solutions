package solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComposeRanges {
	 public static void main(String[] args) {
	        int[] nums = {-1, 2};
	        String[] result = solution(nums);

	        System.out.println(result);
	    }
	 
	 
	 
	 /*
	  * Given a sorted integer array that does not contain any duplicates, return a summary of the number ranges it contains.
	  * Example
	  * 
	  * 
	  * For nums = [-1, 0, 1, 2, 6, 7, 9], the output should be
	  * solution(nums) = ["-1->2", "6->7", "9"]
	  *
	  * 
	  * 
	  */
	 public static String[] solution(int[] nums) {
	        List<String> result = new ArrayList<>();

	        if (nums == null || nums.length == 0) {
	        	String[] temp= new String[0];
	            return temp;
	        }

	        int start = nums[0];
	        int end = nums[0];

	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] == end + 1) {
	                end = nums[i];
	            } else {
	                result.add(getRange(start, end));
	                start = nums[i];
	                end = nums[i];
	            }
	        }

	        result.add(getRange(start, end));
	        String[] result_list= new String[result.size()];
	        for(int i=0; i<result.size(); i++ ) {
	        	result_list[i]=result.get(i);
	        }

	        return result_list;
	    }
	 
	 
	 private static String getRange(int start, int end) {
	        return start == end ? String.valueOf(start) : start + "->" + end;
	    }
	 
	
	
}
		
	
	
	
	
	
	
	
	
	


