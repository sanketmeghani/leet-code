package singlenumber;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testData")
    public void shouldPass(int[] nums, int singleNumber) {
        int output = solution.singleNumber(nums);
        assertThat(output).isEqualTo(singleNumber);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(new int[]{2, 2, 1}, 1),
            Arguments.of(new int[]{4, 1, 2, 1, 2}, 4),
            Arguments.of(new int[]{1}, 1)
        );
    }
}