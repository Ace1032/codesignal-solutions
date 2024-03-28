/**
This problem was asked by Google.

Let A be an N by M matrix in which every row and every column is sorted.

Given i1, j1, i2, and j2, compute the number of elements of M smaller than M[i1, j1] and larger than M[i2, j2].

For example, given the following matrix:

[[1, 3, 7, 10, 15, 20],
 [2, 6, 9, 14, 22, 25],
 [3, 8, 10, 15, 25, 30],
 [10, 11, 12, 23, 30, 35],
 [20, 25, 30, 35, 40, 45]]
And i1 = 1, j1 = 1, i2 = 3, j2 = 3, return 15 as there are 15 numbers in the matrix smaller than 6 or greater than 23.


**/


fun main() {
    val matrix= arrayOf(
            arrayOf(1,3,7,10,15,20),
            arrayOf(2,6,9,14,22,25),
            arrayOf(3,8,10,15,25,30),
            arrayOf(10,11,12,23,30,35),
            arrayOf(20,25,30,35,40,45)
        )
    var i1=1
    var j1=1
    var i2=3
    var j2=3
     
     var ans= solution(matrix, i1,j1,i2,j2)   
    println(ans)
}

fun solution(matrix:Array<Array<Int>>, i1:Int,j1:Int,i2:Int,j2:Int):Int{
    
    var numRows= matrix.size
    var numColums= matrix[0].size
    
    
    val m1=matrix[i1][j1]
    val m2=matrix[i2][j2]
   
    var count=0
    
    for(i in 0 until numRows ){
        for(j in 0 until numColums){
            if(matrix[i][j]< m1 || matrix[i][j]>m2){
                count++
            }
            
        }
       
    }
    
    return count
}
