package dev.sanket.symmetrictree

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.common.buildTree
import dev.sanket.dev.sanket.symmetrictree.Solution
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(
        elements: IntArray,
        isSymmetric: Boolean,
    ) {
        val root = buildTree(elements, 0)
        assertThat(solution.isSymmetric(root)).isEqualTo(isSymmetric)
    }

    companion object {
        @JvmStatic
        fun testData(): Stream<Arguments> =
            Stream.of(
                Arguments.of(intArrayOf(1, 2, 2, 3, 4, 4, 3), true),
                Arguments.of(intArrayOf(1, 2, 2, 0, 3, 0, 3), false),
            )
    }
}
