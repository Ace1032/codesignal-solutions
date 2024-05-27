/*

Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange
the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */

class SortByHeight {
    fun solution(a: MutableList<Int>): MutableList<Int> {
        val list: ArrayList<Int> = ArrayList()

        for(i in a.indices){
            if(a[i] != -1){
                list.add(a[i])
            }
        }
        list.sort()

        for(i in a.indices){
            if(a[i]!=-1){
                a[i]= list.first()
                list.removeFirst()
            }
        }

        return a
    }
}