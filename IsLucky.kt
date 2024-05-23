/**
 * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum
 * of the first half of the digits is equal to the sum of the second half.
 *
 * Given a ticket number n, determine if it's lucky or not.
 *
 * Example
 *
 * For n = 1230, the output should be
 * solution(n) = true;
 * For n = 239017, the output should be
 * solution(n) = false
 *
 */
class IsLucky {

    fun solution(n: Int): Boolean {
        var value=n
        val list:MutableList<Int> =mutableListOf()
        while(value>0){
            list.add(value%10)
            value=value / 10
        }
        var left=0
        for(i in 0 until list.size/2){
            left+=list[i]
        }
        var right=0
        for(i in list.size/2 until list.size){
            right+=list[i]
        }
        if(left == right) return true

        return false
    }
}