/**
 * We want to turn the given integer into a number that has only one non-zero digit using a tail rounding approach.
 * This means that at each step we take the last non 0 digit of the number and round it to 0 or to 10. If it's less
 * than 5 we round it to 0 if it's larger than or equal to 5 we round it to 10 (rounding to 10 means increasing the
 * next significant digit by 1). The process stops immediately once there is only one non-zero digit left.
 *
 * Example
 *
 * For n = 15, the output should be
 * solution(n) = 20;
 *
 * For n = 1234, the output should be
 * solution(n) = 1000.
 *
 * 1234 -> 1230 -> 1200 -> 1000.
 *
 * For n = 1445, the output should be
 * solution(n) = 2000.
 *
 * 1445 -> 1450 -> 1500 -> 2000.
 *
 *
 */
class Rounders {
    fun solution(n: Int): Int {
      var r= n
        for(i in 0 until countPlaces(n)){
            if(r % 10 >= 5){
                r = (r / 10 +1) * 10
            } else{
                r = r / 10 *10
            }
            r = r /10
        }
    return r * Math.pow(10.0 , countPlaces(n).toDouble()).toInt()
    }

    fun countPlaces(n: Int):Int{
        var r= n
        var count =0
        while(r > 10){
            r = r/10
            count++
        }
        return count
    }


}