package dev.sanket.dev.sanket.maxdepthofbtree

import dev.sanket.dev.sanket.common.TreeNode

class Solution {

    fun maxDepth(root: TreeNode?): Int {

        if (root == null) return 0

        val leftDepth = maxDepth(root.left)
        val rightDepth = maxDepth(root.right)

        return if (leftDepth > rightDepth) 1 + leftDepth else 1 + rightDepth;
    }

}