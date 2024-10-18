package palindromenumber;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class SolutionTest {

    private final Solution solution = new Solution();


    @ParameterizedTest
    @ValueSource(ints = {121, 0, 5})
    public void shouldReturnTrue(int x) {
        boolean isPalindrome = solution.isPalindrome(x);

        Assertions.assertThat(isPalindrome).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {123, -121, 10})
    public void shouldReturnFalse(int x) {
        boolean isPalindrome = solution.isPalindrome(x);

        Assertions.assertThat(isPalindrome).isFalse();
    }
}