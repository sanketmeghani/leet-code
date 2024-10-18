package dev.sanket.happynumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @ValueSource(ints = {1, 19})
    public void shouldPass(int n) {
        assertThat(solution.isHappy(n)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {2})
    public void shouldPassForNonHappyNumbers(int n) {
        assertThat(solution.isHappy(n)).isFalse();
    }
}