package mergesortedarray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testOne() {
        int[] nums1 = {1};
        int[] nums2 = {};

        solution.merge(nums1, 1, nums2, 0);

        Assertions.assertThat(nums1).containsExactly(1);
    }

    @Test
    public void testTwo() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        solution.merge(nums1, 3, nums2, 3);

        Assertions.assertThat(nums1).containsExactly(1, 2, 2, 3, 5, 6);
    }

    @Test
    public void shouldPassWhenFirstArrayIsEmpty() {
        int[] nums1 = {0, 0, 0};
        int[] nums2 = {2, 5, 6};

        solution.merge(nums1, 0, nums2, 3);

        Assertions.assertThat(nums1).containsExactly(2, 5, 6);
    }

    @Test
    public void shouldPassWhenSecondArrayIsLargerThanFirst() {
        int[] nums1 = {1, 2, 3, 0, 0, 0, 0};
        int[] nums2 = {2, 5, 6, 9};

        solution.merge(nums1, 3, nums2, 4);

        Assertions.assertThat(nums1).containsExactly(1, 2, 2, 3, 5, 6, 9);
    }
}