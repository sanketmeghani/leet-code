package dev.sanket.plusone

import assertk.assertThat
import assertk.assertions.containsExactly
import dev.sanket.dev.sanket.plusone.Solution
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testOne() {
        val result = solution.plusOne(intArrayOf(1, 2, 3))

        assertThat(result).containsExactly(*intArrayOf(1, 2, 4))
    }
}