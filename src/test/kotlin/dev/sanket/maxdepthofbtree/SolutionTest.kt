package dev.sanket.maxdepthofbtree

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isZero
import dev.sanket.dev.sanket.common.buildTree
import dev.sanket.dev.sanket.maxdepthofbtree.Solution
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun shouldReturnZeroWhenRootIsNull() {
        assertThat(solution.maxDepth(null)).isZero()
    }

    @Test
    fun testOne() {
        val root = buildTree(intArrayOf(3, 9, 20, 0, 0, 15, 7), 0)

        assertThat(solution.maxDepth(root)).isEqualTo(3)
    }
}