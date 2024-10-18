package dev.sanket.longestsubstring

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.longestsubstring.Solution
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @CsvSource(value = ["abcabcbb:3", "bbbbb:1", "pwwkew:3", "ohvhjdml:6", "ggububgvfk:6"], delimiter = ':')
    fun shouldPass(
        input: String,
        length: Int,
    ) {
        val output = solution.lengthOfLongestSubstring(input)
        assertThat(output).isEqualTo(length)
    }

    @Test
    fun baseCase() {
        assertThat(solution.lengthOfLongestSubstring(" ")).isEqualTo(1)
    }
}
