/*
This problem was asked by Google.

Given an array of integers, return a new array where each element in the new array is the number of smaller elements to the right of that element in the original input array.

For example, given the array [3, 4, 9, 6, 1], return [1, 1, 2, 1, 0], since:

There is 1 smaller element to the right of 3
There is 1 smaller element to the right of 4
There are 2 smaller elements to the right of 9
There is 1 smaller element to the right of 6
There are no smaller elements to the right of 1

*/


fun solution(sequence:IntArray): Array<Int>{
    val sequArray= Array<Int>(sequence.size){0}
    for(i in 0 until sequence.size){
        var times=0
        for(j in i until sequence.size){
            if(sequence[i]>sequence[j]){
                times++
            }
            sequArray[i]=times
       }
    }
    
    return sequArray
}
