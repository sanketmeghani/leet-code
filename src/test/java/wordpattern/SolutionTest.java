package wordpattern;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {"abba:dog cat cat dog"}, delimiter = ':')
    public void shouldReturnTrue(String pattern, String s) {
        boolean wordPattern = solution.wordPattern(pattern, s);

        assertThat(wordPattern).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"abba:dog dog dog dog", "abba:dog cat cat fish"}, delimiter = ':')
    public void shouldReturnFalse(String pattern, String s) {
        boolean wordPattern = solution.wordPattern(pattern, s);

        assertThat(wordPattern).isFalse();
    }

    @Test
    public void shouldReturnFalseWhenPatternLengthsAreDifferent() {
        String pattern = "abba";
        String s = "cat dog";

        boolean wordPattern = solution.wordPattern(pattern, s);

        assertThat(wordPattern).isFalse();
    }
}