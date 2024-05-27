/*

Define an integer's roundness as the number of trailing zeroes in it.
Given an integer n, check if it's possible to increase n's roundness by swapping some pair of its digits.

Example

For n = 902200100, the output should be
solution(n) = true.

One of the possible ways to increase roundness of n is to swap digit 1 with digit 0 preceding it: roundness of
902201000 is 3, and roundness of n is 2.

For instance, one may swap the leftmost 0 with 1.

For n = 11000, the output should be
solution(n) = false.

Roundness of n is 3, and there is no way to increase it.
 */
class IncreaseNumberRoundness {
    fun solution(n: Int): Boolean {
        val intialRoundness= countRoundness(n)
        if(countZeros(n)>intialRoundness) return true
        return false
    }

    fun countRoundness(a: Int) : Int{
        var num =a
        var count = 0
        while(num > 0){
            if(num%10 == 0){
                count++
            }else return count
            num=num/10
        }
        return count
    }

    fun countZeros(n :Int) :Int{
        var num=n
        var count =0
        while(num > 0){
            if(num % 10 == 0) count ++
          num = num /10
        }
        return count
    }
}