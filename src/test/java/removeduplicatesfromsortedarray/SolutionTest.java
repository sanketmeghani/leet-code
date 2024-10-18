package removeduplicatesfromsortedarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOne() {
        int[] nums = {1, 1, 2};

        int uniqNumbers = solution.removeDuplicates(nums);

        Assertions.assertThat(uniqNumbers).isEqualTo(2);
    }

    @Test
    public void testTwo() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int uniqNumbers = solution.removeDuplicates(nums);

        Assertions.assertThat(uniqNumbers).isEqualTo(5);
    }

    @Test
    public void shouldPassWhenBothNumbersAreEqual() {
        int[] nums = {1, 1};

        int uniqNumbers = solution.removeDuplicates(nums);

        Assertions.assertThat(uniqNumbers).isEqualTo(1);
    }
}