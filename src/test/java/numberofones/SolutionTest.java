package numberofones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {"11:3", "128:1", "2147483645:30"}, delimiter = ':')
    public void testOne(String input, String output) {
        int count = solution.hammingWeight(Integer.parseInt(input));
        assertThat(count).isEqualTo(Integer.valueOf(output).intValue());
    }
}