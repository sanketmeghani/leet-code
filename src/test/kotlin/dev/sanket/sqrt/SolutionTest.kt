package dev.sanket.sqrt

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.sqrt.Solution
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SolutionTest {

    private val solution = Solution()

    @ParameterizedTest
    @CsvSource(value = ["4:2", "8:2", "1:1", "6:2"], delimiter = ':')
    fun shouldPass(input: String, output: String) {
        val sqrt = solution.mySqrt(input.toInt())
        assertThat(sqrt).isEqualTo(output.toInt())
    }
}