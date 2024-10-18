package dev.sanket.numberofislands

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.numberofislands.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(grid: Array<CharArray>, expected: Int) {
        assertThat(solution.numIslands(grid)).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun testData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(
                    arrayOf(
                        charArrayOf('1', '1', '1', '1', '0'),
                        charArrayOf('1', '1', '0', '1', '0'),
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('0', '0', '0', '0', '0'),
                    ), 1
                ),
                Arguments.of(
                    arrayOf(
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('1', '1', '0', '0', '0'),
                        charArrayOf('0', '0', '1', '0', '0'),
                        charArrayOf('0', '0', '0', '1', '1')
                    ), 3
                )
            )
    }
}
