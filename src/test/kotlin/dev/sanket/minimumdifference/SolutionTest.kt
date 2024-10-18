package dev.sanket.minimumdifference

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.common.buildTree
import dev.sanket.dev.sanket.minimumdifference.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(values: IntArray, expected: Int) {
        val root = buildTree(values, 0)
        val output = solution.getMinimumDifference(root)

        assertThat(output).isEqualTo(expected)
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(4, 2, 6, 1, 3), 1),
            Arguments.of(intArrayOf(1, 0, 3, 0, 0, 2, 0), 1),
            Arguments.of(intArrayOf(236, 104, 701, 0, 227, 0, 911), 9),
        )
    }
}