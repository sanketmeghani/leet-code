package dev.sanket.groupanagrams

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.groupanagrams.Solution
import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @MethodSource("testData")
    fun shouldPass(strs: Array<String>, expected: List<List<String>>) {
        val groupAnagrams = solution.groupAnagrams(strs)

        assertThat(groupAnagrams.size).isEqualTo(expected.size)
    }

    companion object {

        @JvmStatic
        fun testData(): Stream<Arguments> = Stream.of(
            Arguments.of(arrayOf("eat", "tea"), listOf(listOf("east", "tea")))
        )
    }
}