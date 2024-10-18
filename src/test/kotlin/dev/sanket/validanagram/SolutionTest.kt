package dev.sanket.validanagram

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.validanagram.Solution
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @CsvSource(value = ["ab:abc:false", "anagram:nagaram:true"], delimiter = ':')
    fun shouldPass(first: String, second: String, isValid: Boolean) {
        assertThat(solution.isAnagram(first, second)).isEqualTo(isValid)
    }
}