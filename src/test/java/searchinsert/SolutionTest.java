package searchinsert;

import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testOneData")
    public void testOne(int[] nums, int target, int expectedOutput) {
        int output = solution.searchInsert(nums, target);

        Assertions.assertThat(output).isEqualTo(expectedOutput);
    }

    private static Stream<Arguments> testOneData() {
        return Stream.of(
//            Arguments.of(new int[]{1, 3, 5, 6}, 5, 2),
//            Arguments.of(new int[]{1, 3, 5, 6}, 2, 1),
//            Arguments.of(new int[]{1, 3, 5, 6}, 7, 4),
//            Arguments.of(new int[]{1, 3}, 0, 0),
            Arguments.of(new int[]{1, 2, 4, 6, 7}, 3, 2)
        );
    }
}