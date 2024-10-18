package dev.sanket.dev.sanket.minimumdifference

import dev.sanket.dev.sanket.common.TreeNode
import java.util.stream.IntStream

class Solution {

    fun getMinimumDifference(root: TreeNode?): Int {
        val elements = mutableListOf<Int>()
        traverseTree(root, elements)

        var minDifference = Int.MAX_VALUE
        IntStream.range(0, elements.size - 1).forEach {
            val difference = elements[it + 1] - elements[it]
            minDifference = if (minDifference > difference) difference else minDifference
        }

        return minDifference
    }

    private fun traverseTree(node: TreeNode?, elements: MutableList<Int>) {
        node?.let {
            traverseTree(node.left, elements)
            elements.add(node.`val`)
            traverseTree(node.right, elements)
        }
    }
}