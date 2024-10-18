package dev.sanket.dev.sanket.trie

class Trie() {

    private val root = Node()

    fun insert(word: String) {
        var node = root
        for (ch in word.toCharArray()) {
            node = node.addChild(ch)
        }

        node.markAsLeaf()
    }

    fun search(word: String): Boolean {
        var node = root
        for (ch in word.toCharArray()) {
            if (node.getChild(ch) == null) {
                return false
            }

            node = node.getChild(ch)!!
        }

        return node.isLeafNode()
    }

    fun startsWith(prefix: String): Boolean {
        var node = root
        for (ch in prefix.toCharArray()) {
            if (node.getChild(ch) == null) {
                return false
            }

            node = node.getChild(ch)!!
        }

        return true
    }

    private class Node {
        private var alsoLeadNode = false

        private val children = Array<Node?>(26) { null }

        fun addChild(ch: Char): Node {
            val index = charToIndex(ch)

            if (!hasChild(ch)) {
                children[index] = Node()
            }

            return children[index]!!
        }

        private fun charToIndex(ch: Char) = ch.code.minus('a'.code)

        private fun hasChild(ch: Char) = children[charToIndex(ch)] != null

        fun getChild(ch: Char) = children[charToIndex(ch)]

        fun hasNoChild() = children.none { it != null }

        fun markAsLeaf() {
            alsoLeadNode = true
        }

        fun isLeafNode() = alsoLeadNode || hasNoChild()
    }
}

