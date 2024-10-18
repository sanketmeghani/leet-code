package validparenthesis;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(strings = {"()", "()[]{}"})
    public void shouldReturnTrue(String s) {
        assertThat(solution.isValid(s)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"(]", "("})
    public void shouldReturnFalse(String s) {
        assertThat(solution.isValid(s)).isFalse();
    }
}