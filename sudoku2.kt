/*
Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with
numbers in such a way that each column, each row, and each of the nine 3 × 3 sub-grids
that compose the grid all contain all of the numbers from 1 to 9 one time.

Implement an algorithm that will check whether the given grid of numbers represents a
valid Sudoku puzzle according to the layout rules described above. Note that the puzzle
represented by grid does not have to be solvable.

Example

For

grid = [['.', '.', '.', '1', '4', '.', '.', '2', '.'],
        ['.', '.', '6', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '.', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '1', '.', '.', '.', '.', '.', '.'],
        ['.', '6', '7', '.', '.', '.', '.', '.', '9'],
        ['.', '.', '.', '.', '.', '.', '8', '1', '.'],
        ['.', '3', '.', '.', '.', '.', '.', '.', '6'],
        ['.', '.', '.', '.', '.', '7', '.', '.', '.'],
        ['.', '.', '.', '5', '.', '.', '.', '7', '.']]
the output should be
solution(grid) = true;

For

grid = [['.', '.', '.', '.', '2', '.', '.', '9', '.'],
        ['.', '.', '.', '.', '6', '.', '.', '.', '.'],
        ['7', '1', '.', '.', '7', '5', '.', '.', '.'],
        ['.', '7', '.', '.', '.', '.', '.', '.', '.'],
        ['.', '.', '.', '.', '8', '3', '.', '.', '.'],
        ['.', '.', '8', '.', '.', '7', '.', '6', '.'],
        ['.', '.', '.', '.', '.', '2', '.', '.', '.'],
        ['.', '1', '.', '2', '.', '.', '.', '.', '.'],
        ['.', '2', '.', '.', '3', '.', '.', '.', '.']]
the output should be
solution(grid) = false.

The given grid is not correct because there are two 1s in the second column.
 Each column, each row, and each 3 × 3 subgrid can only contain the numbers 1 through 9 one time.


 */

class sudoku2 {
    fun solution(grid: MutableList<MutableList<Char>>): Boolean {

        var num=0
        for (row in grid) {
            if(!isValiedRow(row)) return false
            if(!convertColomToRow(grid, num) ) return false
            num++
        }


        if(!isThreeByThree(grid)) return false
        return true
    }

    fun isValiedRow(grid: MutableList<Char>): Boolean {

        var p = 0
        for (i in grid){
           if(i != '.' && p<grid.size){
               for (j in p +1 until grid.size){
                   if(i == grid[j]) return false
               }
               }
            p++
           }
        println()

        return true
    }

    fun convertColomToRow(grid: MutableList<MutableList<Char>> , num:Int):Boolean{
                var row = mutableListOf<Char>()
                for (gridRow in grid) {
                    row.add(gridRow[num])
                }
                if(!isValiedRow(row)) return false

        return true
    }

    fun isThreeByThree(grid: MutableList<MutableList<Char>>):Boolean{

        for(row in 0 until grid.size step 3){
            for(col in 0 until grid.size step 3){
                val list = mutableListOf<Char>()
                for(i in 0 until 3){
                    for(j in 0 until 3){
                        list.add(grid[row +i][col +j])
                    }
                }
                println(list.toString())
                 if(!isValiedRow(list)) return false
            }
        }



        return true
    }

}