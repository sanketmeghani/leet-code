package dev.sanket.dev.sanket.threesum

class Solution {

    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val threeSums = mutableSetOf<List<Int>>()

        for (i in nums.indices) {
            var j = i + 1
            var k = nums.size - 1

            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    threeSums.add(listOf(nums[i], nums[j], nums[k]))
                    j++
                    k--
                } else if (nums[j] + nums[k] + nums[i] > 0) {
                    k--
                } else {
                    j++
                }
            }
        }

        return threeSums.toList()
    }
}