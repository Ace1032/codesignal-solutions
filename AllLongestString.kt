/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].


 */

class AllLongestString {

    fun solution(inputArray: MutableList<String>): MutableList<String> {
        var longestSize=0
        val tempArray :MutableList<String> = mutableListOf()
        for(i in 0 until inputArray.size){
            if(inputArray[i].length > longestSize){
                longestSize= inputArray[i].length
            }
        }
        for(i in 0 until inputArray.size){
            if(inputArray[i].length == longestSize){
                tempArray.add(inputArray[i])
            }
        }

        return tempArray
    }

}