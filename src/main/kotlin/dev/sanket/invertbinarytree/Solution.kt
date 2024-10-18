package dev.sanket.dev.sanket.invertbinarytree

import dev.sanket.dev.sanket.common.TreeNode

class Solution {

    fun invertTree(root: TreeNode?): TreeNode? {

        root?.let {

            invertTree(root.left)
            invertTree(root.right)

            val temp = root.left
            root.left = root.right
            root.right = temp
        }

        return root
    }
}