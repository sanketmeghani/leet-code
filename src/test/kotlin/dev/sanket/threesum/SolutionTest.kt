package dev.sanket.threesum

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.threesum.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(nums: IntArray, expected: List<List<Int>>) {
        assertThat(solution.threeSum(nums)).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(3, 0, -2, -1, 1, 2), listOf(listOf(-2, -1, 3), listOf(-2, 0, 2), listOf(-1, 0, 1))),
            Arguments.of(intArrayOf(0, 0, 0, 0), listOf(listOf(0, 0, 0))),
            Arguments.of(intArrayOf(0, 0, 0), listOf(listOf(0, 0, 0))),
            Arguments.of(intArrayOf(-1, 0, 1, 2, -1, -4), listOf(listOf(-1, -1, 2), listOf(-1, 0, 1)))
        )
    }
}