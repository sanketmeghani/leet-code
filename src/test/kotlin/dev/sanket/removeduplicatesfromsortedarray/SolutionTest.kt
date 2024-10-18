package dev.sanket.removeduplicatesfromsortedarray

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.removeduplicatesfromsortedarray.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(nums: IntArray, expected: Int) {
        val k = solution.removeDuplicates(nums)

        assertThat(k).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1), 1),
            Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), 5),
            Arguments.of(intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3), 7)
        )
    }
}