package summaryranges;

import java.util.List;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private final Solution solution = new Solution();

    @ParameterizedTest
    @MethodSource("successTestData")
    public void shouldReturnTrue(int[] nums, List<String> expectedRanges) {
        List<String> ranges = solution.summaryRanges(nums);

        Assertions.assertThat(ranges).containsExactly(expectedRanges.toArray(new String[expectedRanges.size()]));

    }

    private static Stream<Arguments> successTestData() {
        return Stream.of(
            Arguments.of(new int[]{}, List.of()),
            Arguments.of(new int[]{0}, List.of("0")),
            Arguments.of(new int[]{0, 1, 2, 4, 5, 7}, List.of("0->2", "4->5", "7")),
            Arguments.of(new int[]{0, 2, 3, 4, 6, 8, 9}, List.of("0", "2->4", "6", "8->9"))
        );
    }
}