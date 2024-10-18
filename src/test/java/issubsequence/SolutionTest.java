package issubsequence;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOne() {
        String s = "abc";
        String t = "ahbgdc";

        boolean subsequence = solution.isSubsequence(s, t);

        assertThat(subsequence).isTrue();
    }

    @Test
    public void testTwo() {
        String s = "axc";
        String t = "ahbgdc";

        boolean subsequence = solution.isSubsequence(s, t);

        assertThat(subsequence).isFalse();
    }

}