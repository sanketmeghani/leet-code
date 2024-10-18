package removeelement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    public void testOne() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int remainingElements = solution.removeElement(nums, val);

        assertThat(remainingElements).isEqualTo(2);
    }

    @Test
    public void testTwo() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int remainingElements = solution.removeElement(nums, val);


        assertThat(remainingElements).isEqualTo(5);
    }

    @Test
    public void shouldPassWhenNoMatchingElements() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int val = 8;

        int remainingElements = solution.removeElement(nums, val);

        assertThat(remainingElements).isEqualTo(nums.length);
    }
}