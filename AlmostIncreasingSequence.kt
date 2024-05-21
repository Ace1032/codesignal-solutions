/*Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
solution(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
solution(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

*/

fun main() {
    val sequence= mutableListOf<Int>()
    sequence.addAll(listOf(1, 3, 2, 1))
    println(solution(sequence))
}


fun solution(sequence: MutableList<Int>): Boolean {

    if(sequence.size<3) return true;
    for(i in (sequence.size -1) downTo 1){
        if(sequence[i] <sequence[i-1]){
            if(isSequence(removeArray(sequence,i)))return true
            if(isSequence(removeArray(sequence,i-1)))return true

        }
    }
    return false
}

fun removeArray(list: MutableList<Int>, pos:Int): ArrayList<Int>{
    var temp=ArrayList<Int>()
    for(i in 0..list.size-1){
        if(i!=pos){
            temp.add(list[i])
        }
    }
   return temp
}

fun isSequence(list:MutableList<Int>):Boolean{
    for(i in (list.size-1) downTo 1){
        if(list[i]<= list[i-1]) return false

    }
    return true
}




