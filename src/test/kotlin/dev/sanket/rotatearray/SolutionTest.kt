package dev.sanket.rotatearray

import assertk.assertThat
import assertk.assertions.containsExactly
import dev.sanket.dev.sanket.rotatearray.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(nums: IntArray, k: Int, expected: IntArray) {
        solution.rotate(nums, k)
        assertThat(nums).containsExactly(*expected)
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6, 7), 0, intArrayOf(1, 2, 3, 4, 5, 6, 7)),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6, 7), 7, intArrayOf(1, 2, 3, 4, 5, 6, 7)),
            Arguments.of(intArrayOf(1, 2, 3, 4, 5, 6, 7), 3, intArrayOf(5, 6, 7, 1, 2, 3, 4)),
            Arguments.of(intArrayOf(-1, -100, 3, 99), 2, intArrayOf(3, 99, -1, -100)),
            Arguments.of(
                intArrayOf(2147483647, -2147483648, 33, 219, 0),
                4,
                intArrayOf(-2147483648, 33, 219, 0, 2147483647)
            ),
        )
    }
}