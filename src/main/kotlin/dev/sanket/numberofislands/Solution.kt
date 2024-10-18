package dev.sanket.dev.sanket.numberofislands

class Solution {

    fun numIslands(grid: Array<CharArray>): Int {
        var noOfIslands = 0

        for (row in grid.indices) {
            for (col in grid[row].indices) {
                if (grid[row][col] == '1') {
                    noOfIslands++;
                    markIslandAsVisited(grid, row, col)
                }
            }
        }

        return noOfIslands
    }

    private fun markIslandAsVisited(grid: Array<CharArray>, row: Int, col: Int) {
        grid[row][col] = 'x'

        if (row - 1 >= 0 && grid[row - 1][col] == '1') {
            markIslandAsVisited(grid, row - 1, col)
        }

        if (col - 1 >= 0 && grid[row][col - 1] == '1') {
            markIslandAsVisited(grid, row, col - 1)
        }

        if (row + 1 < grid.size && grid[row + 1][col] == '1') {
            markIslandAsVisited(grid, row + 1, col)
        }

        if (col + 1 < grid[row].size && grid[row][col + 1] == '1') {
            markIslandAsVisited(grid, row, col + 1)
        }
    }
}
