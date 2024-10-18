package searchinsert;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int start, int end) {
        int middleIndex = (start + end) / 2;

        if (nums[middleIndex] == target) {
            return middleIndex;
        }

        if (start == end) {
            return nums[start] < target ? start + 1 : start;
        }

        if (nums[middleIndex] < target) {
            return search(nums, target, Math.min(middleIndex + 1, end), end);
        } else {
            return search(nums, target, start, Math.max(middleIndex - 1, start));
        }
    }
}
