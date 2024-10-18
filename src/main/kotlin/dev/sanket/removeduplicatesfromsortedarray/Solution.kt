package dev.sanket.dev.sanket.removeduplicatesfromsortedarray

class Solution {

    fun removeDuplicates(nums: IntArray): Int {

        if (nums.size == 1) return nums.size

        var i = 1
        var j = 0
        var count = 0

        while (i < nums.size) {
            while (i < nums.size && nums[j] == nums[i]) {
                count++
                i++
            }

            j++

            if (count > 0) {
                nums[j] = nums[j - 1]
                count = 0
            } else {
                nums[j] = nums[i]
                i++
            }
        }

        return j + 1
    }
}