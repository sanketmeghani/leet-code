package dev.sanket.dev.sanket.rotatematrix

class Solution {
    fun rotate(matrix: Array<IntArray>) {
        if (matrix.size == 1) {
            return
        }

        for (i in 0..matrix.size.div(2).minus(1)) {
            for (j in 0..matrix[i].size.minus(1)) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[matrix.size - i - 1][j]
                matrix[matrix.size - i - 1][j] = temp
            }
        }

        for (i in 0..matrix.size.minus(1)) {
            for (j in i.plus(1)..matrix[i].size.minus(1)) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
    }
}
