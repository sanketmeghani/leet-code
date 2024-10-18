package dev.sanket.permutations

import assertk.assertThat
import assertk.assertions.containsExactlyInAnyOrder
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.permutations.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(nums: IntArray, expected: List<List<Int>>) {
        val output = solution.permute(nums)

        assertThat(output.size).isEqualTo(expected.size)
        assertThat(output).containsExactlyInAnyOrder(*expected.toTypedArray())
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(
                intArrayOf(1, 2, 3),
                listOf(
                    listOf(1, 2, 3),
                    listOf(1, 3, 2),
                    listOf(2, 1, 3),
                    listOf(2, 3, 1),
                    listOf(3, 1, 2),
                    listOf(3, 2, 1)
                )
            ),
            Arguments.of(intArrayOf(0, 1), listOf(listOf(0, 1), listOf(1, 0))),
            Arguments.of(intArrayOf(1), listOf(listOf(1)))
        )
    }
}