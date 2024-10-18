package dev.sanket.dev.sanket.mindistanceinbst

import dev.sanket.dev.sanket.common.TreeNode
import kotlin.math.min

class Solution {

    private var minDistance: Int = Int.MAX_VALUE
    private var prevNode: TreeNode? = null

    fun minDiffInBST(root: TreeNode?): Int {
        traverseTree(root)

        return minDistance
    }

    private fun traverseTree(node: TreeNode?) {
        if (node == null) return

        traverseTree(node.left)
        prevNode?.let {
            minDistance = min(node.`val` - prevNode!!.`val`, minDistance)
        }

        prevNode = node
        traverseTree(node.right)
    }
}