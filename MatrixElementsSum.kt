/*
After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost, and some of them are free, 
but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious, they refuse to stay in any of the free rooms, 
or any of the rooms below any of the free rooms.

Given matrix, a rectangular matrix of integers, where each value represents the cost of the room, your task is to return the total sum of all rooms 
that are suitable for the CodeBots (ie: add up all the values that don't appear below a 0).

Example

For

matrix = [[0, 1, 1, 2], 
          [0, 5, 0, 0], 
          [2, 0, 3, 3]]
the output should be
solution(matrix) = 9.

*/


class MatrixElementsSum {

    fun solution(matrix: MutableList<MutableList<Int>>): Int {
        var count=0

        for(y in 0 until matrix.size){
            for(x in 0 until matrix[y].size){
                if(matrix[y][x]>0){
                    if(!isGhostMatrix(x,y-1,matrix)){
                        count+=matrix[y][x]
                    }
                }
            }
        }

        return count
    }

    fun isGhostMatrix(x:Int, y:Int, matrix: MutableList<MutableList<Int>> ):Boolean{
        var y=y
        while(y>=0){
            if(matrix[y][x] == 0) return true
            y--
        }
        return false
    }

}
