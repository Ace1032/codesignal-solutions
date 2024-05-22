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