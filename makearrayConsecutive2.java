/**
Given an array of integers, we need to find the number of "holes" that need
 to be filled such that it contains all the integers from some range.

Example

For sequence = [6, 2, 3, 8], the output should be

makeArrayConsecutive2(sequence) = 3.

We need to add in 4, 5 and 7.
**/
public static int makeArrayConsecutive2(int[] sequence) {
     Arrays.sort(sequence);
    int holes=0;
        
    for (int i = sequence[0]; i <= sequence[sequence.length - 1]; i++){
        int index = Arrays.binarySearch(sequence, i);
        if(index<0)
            holes++;
    }
    return holes;
}