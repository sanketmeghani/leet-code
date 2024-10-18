package dev.sanket.dev.sanket.symmetrictree

import dev.sanket.dev.sanket.common.TreeNode

class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true

        return isSymmetric(root.left, root.right)
    }

    private fun isSymmetric(
        nodeOne: TreeNode?,
        nodeTwo: TreeNode?,
    ): Boolean {
        if (nodeOne == null && nodeTwo == null) return true

        if (nodeOne != null && nodeTwo != null) {
            if (nodeOne.`val` != nodeTwo.`val`) return false

            return isSymmetric(nodeOne.left, nodeTwo.right) && isSymmetric(nodeOne.right, nodeTwo.left)
        }

        return false
    }
}
