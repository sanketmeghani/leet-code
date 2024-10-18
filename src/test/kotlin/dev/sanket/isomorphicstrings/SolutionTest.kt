package dev.sanket.isomorphicstrings

import assertk.assertThat
import assertk.assertions.isEqualTo
import dev.sanket.dev.sanket.isomorphicstrings.Solution
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class SolutionTest {
    private val solution = Solution()

    @ParameterizedTest
    @CsvSource(value = ["egg:add:true", "egg:egg:true", "egg:hello:false", "badc:baba:false"], delimiter = ':')
    fun shouldPass(
        s: String,
        t: String,
        isIsMorphic: Boolean,
    ) {
        assertThat(solution.isIsomorphic(s, t)).isEqualTo(isIsMorphic)
    }
}
