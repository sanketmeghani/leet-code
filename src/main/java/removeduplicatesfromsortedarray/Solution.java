package removeduplicatesfromsortedarray;

public class Solution {
    public int removeDuplicates(int[] nums) {

        int firstIndex = 0;
        int secondIndex = 1;

        while (secondIndex < nums.length) {
            while (secondIndex < nums.length && nums[firstIndex] == nums[secondIndex]) {
                secondIndex++;
            }

            if (secondIndex < nums.length) {

                firstIndex++;
                nums[firstIndex] = nums[secondIndex];
                secondIndex++;
            }
        }

        return firstIndex + 1;
    }
}
