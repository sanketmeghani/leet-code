package dev.sanket.linkedlistcycle

import assertk.assertThat
import assertk.assertions.isFalse
import dev.sanket.dev.sanket.linkedlistcycle.Solution
import org.junit.jupiter.api.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun shouldReturnFalseWhenListIsNull() {
        val hasCycle = solution.hasCycle(null)

        assertThat(hasCycle).isFalse()
    }
}
