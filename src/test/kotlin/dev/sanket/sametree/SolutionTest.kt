package dev.sanket.sametree

import assertk.assertThat
import assertk.assertions.isTrue
import dev.sanket.dev.sanket.common.buildTree
import dev.sanket.dev.sanket.sametree.Solution
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testOne() {
        val p = buildTree(intArrayOf(1, 2, 3), 0)
        val q = buildTree(intArrayOf(1, 2, 3), 0)

        assertThat(solution.isSameTree(p, q)).isTrue()
    }
}