/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
solution(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".


 */

class CommonCharacterCount {
    fun solution(s1: String, s2: String): Int {
        val hashMap = HashMap<Char, pair>()

        for(i in 0 until s1.length){
            if(hashMap.containsKey(s1[i])){
                var temp= hashMap.getValue(s1[i])
                temp.s1Length++
            }else{
                hashMap[s1[i]]= pair(1,0)
            }
        }

        for(i in 0 until s2.length){
            if(hashMap.containsKey(s2[i])){
                var temp2= hashMap.getValue(s2[i])
                temp2.s2Length++
            }else{
                hashMap[s2[i]]= pair(0,1)
            }
        }
        var count=0
        for(entry in hashMap){
            count= count+short(entry.value)
        }

        return count
    }

    fun short(pair: pair):Int{
        if(pair.s2Length < pair.s1Length){
            return pair.s2Length
        }else return pair.s1Length
    }

}
data class pair(
    var s1Length:Int, var s2Length:Int
)