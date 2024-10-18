package dev.sanket.majorityelement

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.majorityelement.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(nums: IntArray, expected: Int) {
        val majorityElement = solution.majorityElement(nums)
        assertThat(majorityElement).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1), 1),
            Arguments.of(intArrayOf(2, 2), 2),
            Arguments.of(intArrayOf(3, 2, 3), 3),
            Arguments.of(intArrayOf(6, 5, 5), 5),
            Arguments.of(intArrayOf(2, 2, 1, 1, 1, 2, 2), 2),
        )
    }
}