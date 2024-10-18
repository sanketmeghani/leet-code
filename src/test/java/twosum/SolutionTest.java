package twosum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOne() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] indexes = solution.twoSum(nums, target);

        assertThat(indexes).containsExactly(0, 1);
    }

}