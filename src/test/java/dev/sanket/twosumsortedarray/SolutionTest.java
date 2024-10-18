package dev.sanket.twosumsortedarray;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("testData")
    public void shouldPass(int[] numbers, int target, int[] expected) {
        int[] indices = solution.twoSum(numbers, target);

        assertThat(indices).containsExactly(expected);
    }

    private static Stream<Arguments> testData() {
        return Stream.of(
            Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
            Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}),
            Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2}),
            Arguments.of(new int[]{5, 25, 75}, 100, new int[]{2, 3}),
            Arguments.of(new int[]{-10, -8, -2, 1, 2, 5, 6}, 0, new int[]{3, 5})
        );
    }
}