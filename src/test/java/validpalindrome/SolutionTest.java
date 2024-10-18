package validpalindrome;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOne() {
        String input = "A man, a plan, a canal: Panama";
        boolean isPalindrome = solution.isPalindrome(input);

        assertThat(isPalindrome).isTrue();
    }

    @Test
    public void testTwo() {
        String input = "race a car";
        boolean isPalindrome = solution.isPalindrome(input);

        assertThat(isPalindrome).isFalse();
    }


    @Test
    public void testThree() {
        String input = " ";
        boolean isPalindrome = solution.isPalindrome(input);

        assertThat(isPalindrome).isTrue();
    }
}