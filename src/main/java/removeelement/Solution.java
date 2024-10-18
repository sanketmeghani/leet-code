package removeelement;

import java.util.Arrays;

public class Solution {

    public int removeElement(int[] nums, int val) {

        // Iterate over nums
        // Check if current value == val
        // If yes -> replace it with next non-equal value

        int nonVal = nums.length - 1;

        for (int i = 0; i < nums.length && (i < nonVal); i++) {
            if (nums[i] != val) {
                continue;
            }

            if(nums[i] == val) {
                while(nums[nonVal] == val && nonVal > i) {
                    nonVal--;
                }
            }

            if (i != nonVal) {
                nums[i] = nums[nonVal];
                nums[nonVal] = val;
            }
        }

        return Long.valueOf(Arrays.stream(nums).filter((num) -> num != val).count()).intValue();
    }

}
