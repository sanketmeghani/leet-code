package dev.sanket.rotatematrix

import assertk.assertThat
import assertk.assertions.containsExactly
import dev.sanket.dev.sanket.rotatematrix.Solution
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(
        matrix: Array<IntArray>,
        expected: Array<IntArray>,
    ) {
        solution.rotate(matrix)
        matrix.forEachIndexed { index, it ->
            assertThat(it).containsExactly(*expected[index])
        }
    }

    companion object {
        @JvmStatic
        fun testData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(arrayOf(intArrayOf(1)), arrayOf(intArrayOf(1))),
                Arguments.of(arrayOf(intArrayOf(4, 1), intArrayOf(5, 2)), arrayOf(intArrayOf(5, 4), intArrayOf(2, 1))),
                Arguments.of(
                    arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)),
                    arrayOf(intArrayOf(7, 4, 1), intArrayOf(8, 5, 2), intArrayOf(9, 6, 3)),
                ),
            )
    }
}
