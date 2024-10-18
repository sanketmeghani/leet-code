package dev.sanket.dev.sanket.avgoflevels

import dev.sanket.dev.sanket.common.TreeNode

class Solution {

    private val toBeVisited = mutableListOf<TreeNode>()

    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val averages = mutableListOf<Double>()

        root?.let {
            toBeVisited.add(root)

            while (toBeVisited.isNotEmpty()) {
                averages.add(findAverage())
            }
        }

        return averages.toDoubleArray()
    }

    private fun findAverage(): Double {
        val nextToBeVisited = mutableListOf<TreeNode>()
        val average = toBeVisited.map {
            it.left?.let { left -> nextToBeVisited.add(left) }
            it.right?.let { right -> nextToBeVisited.add(right) }

            it.`val`
        }.toIntArray().average()

        toBeVisited.clear()
        toBeVisited.addAll(nextToBeVisited)

        return average
    }
}