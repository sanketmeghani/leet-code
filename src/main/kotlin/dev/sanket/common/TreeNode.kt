package dev.sanket.dev.sanket.common

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null

    fun left(left: TreeNode?): TreeNode {
        this.left = left
        return this
    }

    fun right(right: TreeNode?): TreeNode {
        this.right = right
        return this
    }
}

fun buildTree(elements: IntArray, index: Int): TreeNode? {
    if (elements[index] == 0) {
        return null
    }

    val node = TreeNode(elements[index])

    if (elements.size > (2 * index) + 1) {
        val leftChild = buildTree(elements, (2 * index) + 1)
        node.left(leftChild)
    }

    if (elements.size > (2 * index) + 2) {
        val rightChild = buildTree(elements, (2 * index) + 2)
        node.right(rightChild)
    }

    return node
}