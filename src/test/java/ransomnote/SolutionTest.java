package ransomnote;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOne() {
        String ransomNote = "aa";
        String magazine = "aab";

        boolean canConstruct = solution.canConstruct(ransomNote, magazine);

        assertThat(canConstruct).isTrue();
    }

    @Test
    public void testTwo() {
        String ransomNote = "a";
        String magazine = "b";

        boolean canConstruct = solution.canConstruct(ransomNote, magazine);

        assertThat(canConstruct).isFalse();
    }

    @Test
    public void testThree() {
        String ransomNote = "aa";
        String magazine = "ab";

        boolean canConstruct = solution.canConstruct(ransomNote, magazine);

        assertThat(canConstruct).isFalse();
    }
}