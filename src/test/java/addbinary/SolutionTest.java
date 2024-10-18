package addbinary;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource(value = {"11:1:100", "1010:1011:10101", "110010:10111:1001001"}, delimiter = ':')
    public void shouldPass(String a, String b, String sum) {
        String output = solution.addBinary(a, b);
        Assertions.assertThat(output).isEqualTo(sum);
    }

}