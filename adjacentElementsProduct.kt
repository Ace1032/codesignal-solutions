/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.
*/

fun solution(inputArray: MutableList<Int>): Int {
 var minValue = Int.MIN_VALUE
 for(i in 0 until inputArray.size-1){
     if(inputArray[i]* inputArray[i+1]>minValue){
         minValue=inputArray[i]* inputArray[i+1]
     }
 }
 return minValue
}
