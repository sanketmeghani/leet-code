package dev.sanket.mergeintervals

import assertk.assertThat
import assertk.assertions.isEqualTo
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(intervals: Array<IntArray>, expected: Array<IntArray>) {
        val output = solution.merge(intervals)

        assertThat(output.size).isEqualTo(expected.size)
        output.forEachIndexed { index, interval -> assertThat(interval).isEqualTo(expected[index]) }
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(
                arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)),
                arrayOf(intArrayOf(1, 6), intArrayOf(8, 10), intArrayOf(15, 18))
            ),
            Arguments.of(arrayOf(intArrayOf(1, 8)), arrayOf(intArrayOf(1, 8))),
            Arguments.of(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5)), arrayOf(intArrayOf(1, 5))),
            Arguments.of(arrayOf(intArrayOf(1, 4), intArrayOf(0, 4)), arrayOf(intArrayOf(0, 4)))
        )
    }
}