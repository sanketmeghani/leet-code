package climbstairs;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {"0:1", "1:1", "2:2", "3:3"}, delimiter = ':')
    public void shouldPass(String input, String output) {
        int noOfWays = solution.climbStairs(Integer.parseInt(input));

        Assertions.assertThat(noOfWays).isEqualTo(Integer.valueOf(output));
    }

}