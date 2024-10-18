package dev.sanket.minsubarraysize

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.minsubarraysize.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(nums: IntArray, target: Int, size: Int) {
        val length = solution.minSubArrayLen(target, nums)
        assertThat(length).isEqualTo(size)
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(2, 3, 1, 2, 4, 3), 7, 2),
            Arguments.of(intArrayOf(1, 4, 4), 4, 1),
            Arguments.of(intArrayOf(1, 1, 1, 1, 1, 1, 1, 1), 11, 0),
        )
    }
}