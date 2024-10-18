package dev.sanket.lengthoflastword;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {"Hello World:5", "   fly me   to   the moon  :4", "hello:5"}, delimiter = ':')
    public void shouldPass(String input, int expected) {
        assertThat(solution.lengthOfLastWord(input)).isEqualTo(expected);
    }
}